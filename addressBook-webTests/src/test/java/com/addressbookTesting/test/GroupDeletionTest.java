package com.addressbookTesting.test;

import com.addressbookTesting.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GroupDeletionTest extends TestBase {


    @Test
    public void testGroupDeletion() {
        app.getNavigationToGroup().goToGroupPage();

        if(! app.getGroupHelper().isThereGroup()){
            app.getGroupHelper().createGroup(new GroupData("test1",null,null));
        }
        //int before= app.getGroupHelper().getGroupCount();
        List<GroupData> before=app.getGroupHelper().getGroupList();
        app.getGroupHelper().selectGroup(before.size() -1);
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
        List<GroupData> after=app.getGroupHelper().getGroupList();
        //int after= app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after.size(),before.size()-1);
    }


}

