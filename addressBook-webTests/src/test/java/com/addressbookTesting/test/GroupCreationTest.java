package com.addressbookTesting.test;

import com.addressbookTesting.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase{


    @Test
    //Fixture . Test between Before and After Method
    public void testGroupCreation() {

        app.getNavigatioToGroup().goToGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("test1","test2","test3"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
    }


}
