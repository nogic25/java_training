package com.addressbookTesting.test;

import com.addressbookTesting.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.List;

public class GroupCreationTest extends TestBase {


    @Test
    //Fixture . Test between Before and After Method
    public void testGroupCreation() {
        app.getNavigationToGroup().goToGroupPage();
        //creating the list of groups
        List<GroupData> before = app.getGroupHelper().getGroupList();
        GroupData group = new GroupData("Clients", null, null);
        app.getGroupHelper().createGroup(group);
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size() + 1);
        before.add(group);

        // we have to loop through all the ID of groups and find the highest one. That is the most recent one
      /*  int max=0;
        for (GroupData g:after ){
            if(g.getId()>max){
                max=g.getId();
            }
        }*/
        //functional programming.
        //create anonymous functions.

       //int max1= after.stream().max((o1, o2) -> Integer.compare(o1.getId(),o2.getId())).get().getId();
        group.setId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(),o2.getId())).get().getId());
        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
    }
}