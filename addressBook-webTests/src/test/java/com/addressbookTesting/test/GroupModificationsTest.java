package com.addressbookTesting.test;

import com.addressbookTesting.model.GroupData;
import org.testng.annotations.Test;

/**
 * Created by anastasiyam on 2/6/2017.
 */
public class GroupModificationsTest extends TestBase {

@Test
    public void testGroupModification(){

    app.getNavigationToGroup().goToGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("New","test1","test1"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
}
}
