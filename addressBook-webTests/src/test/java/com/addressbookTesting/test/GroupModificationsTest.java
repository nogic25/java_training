package com.addressbookTesting.test;

import com.addressbookTesting.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.List;

/**
 * Created by anastasiyam on 2/6/2017.
 */
public class GroupModificationsTest extends TestBase {

@Test
    public void testGroupModification(){

    app.getNavigationToGroup().goToGroupPage();

    if(! app.getGroupHelper().isThereGroup()){
        app.getGroupHelper().createGroup(new GroupData("Friends",null,null));
    }
    List<GroupData> before=app.getGroupHelper().getGroupList();
    //int before= app.getGroupHelper().getGroupCount();
    app.getGroupHelper().selectGroup(before.size()-1);
    app.getGroupHelper().initGroupModification();
    //obtain ID from the lest group
    GroupData groupMod=new GroupData(before.get(before.size()-1).getId(),"Workers","test1","test1");
    app.getGroupHelper().fillGroupForm(groupMod);
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
    List<GroupData> after=app.getGroupHelper().getGroupList();
    //int after= app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after.size(),before.size());
    //check if both list are consistent
    //before.remove(before.size()-1);
    // Множества: неупорядоченные коллекции
    before.remove(before.size()-1);
    before.add(groupMod);
    Assert.assertEquals(new HashSet<Object>(before),new HashSet<Object>(after));


}
}
