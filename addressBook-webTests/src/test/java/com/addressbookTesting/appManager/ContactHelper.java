package com.addressbookTesting.appManager;

import com.addressbookTesting.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

/**
 * Created by anastasiyam on 2/5/2017.
 */
public class ContactHelper extends HelperBase {


    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void createNewContact(ContactData contactData,boolean creation) {
        type(By.name("firstname"), contactData.getUserName());
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("mobile"), contactData.getPhoneNumber());
        if (creation){
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        }else
           Assert.assertFalse(isElementPresent(By.name("new_group"))); {
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
}
