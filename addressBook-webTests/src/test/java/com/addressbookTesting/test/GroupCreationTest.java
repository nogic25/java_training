package com.addressbookTesting.test;

import com.addressbookTesting.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase{


    @Test
    //Fixture . Test between Before and After Method
    public void testGroupCreation() {

        app.getNavigationToGroup().goToGroupPage();
        app.getGroupHelper().createGroup(new GroupData("Co-Worker",null,null));

    }


}
