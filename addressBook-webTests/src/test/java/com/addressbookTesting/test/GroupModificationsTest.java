package com.addressbookTesting.test;

import com.addressbookTesting.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by anastasiyam on 2/6/2017.
 */
public class GroupModificationsTest extends TestBase {

@Test
    public void testGroupModification(){

    app.getNavigationToGroup().goToGroupPage();

    if(! app.getGroupHelper().isThereGroup()){
        app.getGroupHelper().createGroup(new GroupData("Co-Worker",null,null));
    }
    List<GroupData> before=app.getGroupHelper().getGroupList();
    //int before= app.getGroupHelper().getGroupCount();
    app.getGroupHelper().selectGroup(before.size()-1);
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("New","test1","test1"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
    List<GroupData> after=app.getGroupHelper().getGroupList();
    //int after= app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after.size(),before.size());
}
}
