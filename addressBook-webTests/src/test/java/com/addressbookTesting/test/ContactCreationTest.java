package com.addressbookTesting.test;

import com.addressbookTesting.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase{

    @Test

        public void testContactCreation() {
        app.getNavigationToContact().goToAddContact();

        //create additional class for data. Create a new class which would have a constructor and then pass it in the method
        app.getContactHelper().createNewContact(new ContactData("Nastia", "Motalava", "3421234567"));
        app.getContactHelper().submitContactCreation();

        }

}
