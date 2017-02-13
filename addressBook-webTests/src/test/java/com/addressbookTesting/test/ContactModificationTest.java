package com.addressbookTesting.test;

import com.addressbookTesting.model.ContactData;

/**
 * Created by anastasiyam on 2/12/2017.
 */
public class ContactModificationTest extends TestBase {

    public void testContactModification() {

        app.getNavigationHelper().goToHomePage();
        app.getContactHelper().InitiateContactModification();
        app.getContactHelper().createNewContact(new ContactData("Kostia", "Motalav", "3421234567",null));
        app.getContactHelper().SubmitGroupModification();
        app.getNavigationHelper().returnToHomePage();

    }
    }
