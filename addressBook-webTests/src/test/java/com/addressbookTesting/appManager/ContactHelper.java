package com.addressbookTesting.appManager;

import com.addressbookTesting.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by anastasiyam on 2/5/2017.
 */
public class ContactHelper extends HelperBase {
   private  FirefoxDriver wd;

   public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void createNewContact(ContactData contactData) {
        type(By.name("firstname"),contactData.getUserName() );
        type(By.name("lastname"),contactData.getLastName() );
        type(By.name("mobile"),contactData.getPhoneNumber() );
    }

    public void submitContactCreation() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }


}
