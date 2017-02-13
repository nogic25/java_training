package com.addressbookTesting.test;

import com.addressbookTesting.model.ContactData;
import org.testng.annotations.Test;

/**
 * Created by anastasiyam on 2/12/2017.
 */
public class ContactModificationTest extends TestBase {
@Test
    public void testContactModification() {

        app.getNavigationHelper().goToHomePage();
        app.getContactHelper().InitiateContactModification();
        app.getContactHelper().createNewContact(new ContactData("Evgenii", "Meshkow", "3421234567",null),false);
        app.getContactHelper().SubmitGroupModification();
        app.getNavigationHelper().returnToHomePage();

    }
    }
