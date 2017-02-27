package com.addressbookTesting.test;

import com.addressbookTesting.model.ContactData;
import org.testng.annotations.Test;

/**
 * Created by anastasiyam on 2/12/2017.
 */
public class ContactModificationTest extends TestBase {
@Test(enabled=false)
    public void testContactModification() {

        app.getNavigationHelper().goToHomePage();
        if(! app.getContactHelper().isThereContact()){
        app.getContactHelper().createContact(new ContactData("Kostia", "Motalava", "3421234567","test1"),true);
    }
        app.getContactHelper().selectContact();
        app.getContactHelper().InitiateContactModification();
        app.getContactHelper().createNewContact(new ContactData("Evgenii", "Meshkow", "3421234567",null),false);
        app.getContactHelper().SubmitGroupModification();
        app.getNavigationHelper().returnToHomePage();

    }
    }
