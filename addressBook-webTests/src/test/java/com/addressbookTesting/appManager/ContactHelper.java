package com.addressbookTesting.appManager;

import com.addressbookTesting.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anastasiyam on 2/5/2017.
 */
public class ContactHelper extends HelperBase {


    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void createNewContact(ContactData contactData, boolean creation) {
        type(By.name("firstname"), contactData.getUserName());
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("mobile"), contactData.getPhoneNumber());
        if (creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        {
            //click,select from the dropDOwn list

        }

    }

    public void submitContactCreation() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }


    public void InitiateContactModification() {
        click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
    }

    public void SubmitGroupModification() {
        click(By.xpath("//div[@id='content']/form[1]/input[22]"));
    }

    public void createContact(ContactData contact, boolean creation) {

        createNewContact(contact, creation);
        submitContactCreation();

    }

    public boolean isThereContact() {
        return (isElementPresent(By.name("selected[]")));
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }

    public List<ContactData> getContactList() {
        List<ContactData> contacts = new ArrayList<ContactData>();
        List<WebElement> elements = wd.findElements(By.cssSelector("tr.entry"));
        for (WebElement element : elements) {
            String userName = element.getText();
            //convert String type to int -use Integer.parseInt
            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            ContactData contact = new ContactData(id,userName,null,null,null);
           contacts.add(contact);
        }
        return contacts;
    }
}