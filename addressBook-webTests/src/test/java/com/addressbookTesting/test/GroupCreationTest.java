package com.addressbookTesting.test;

import com.addressbookTesting.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GroupCreationTest extends TestBase{


    @Test
    //Fixture . Test between Before and After Method
    public void testGroupCreation() {
        app.getNavigationToGroup().goToGroupPage();
        //creating the list of groups
        List<GroupData> before=app.getGroupHelper().getGroupList();

        app.getGroupHelper().createGroup(new GroupData("Friends",null,null));
        List<GroupData> after=app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(),before.size()+1);
    }


}
