package com.addressbookTesting.test;

import com.addressbookTesting.model.ContactData;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;

public class ContactCreationTest extends TestBase{

    @Test(enabled=false)

        public void testContactCreation() {
        app.getNavigationToGroup().goToAddContact();

        //create additional class  data. Create a new class which would have a constructor and then pass it in the method
        List<ContactData> before = app.getContactHelper().getContactList();
        ContactData contact= new ContactData("Kostia", "Motalava", "3421234567","Clients");
        app.getContactHelper().createContact((contact),true);
        List<ContactData> after = app.getContactHelper().getContactList();
       // Assert.assertEquals(after.size(), before.size() +1);

        before.add(contact);
        Comparator<? super ContactData> byId=(g1, g2)->Integer.compare(g1.getId(),g2.getId());
        before.sort(byId);
        after.sort(byId);
        //Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
       // Assert.assertEquals(before ,after);
    }
}


