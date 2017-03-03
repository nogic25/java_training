package com.addressbookTesting.test;

import com.addressbookTesting.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class GroupDeletionTest extends TestBase {


    @Test
    public void testGroupDeletion() {
        app.goToGroup().GroupPage();

        //if(! app.getGroupHelper().isThereGroup()){
        if( app.getGroupHelper().list().size()==0){

            app.getGroupHelper().create(new GroupData().withName("test1"));
        }


        //int before= app.getGroupHelper().getGroupCount();
        List<GroupData> before=app.getGroupHelper().list();

        int index=before.size() -1;
        app.getGroupHelper().delete(index);
        List<GroupData> after=app.getGroupHelper().list();
        //int after= app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after.size(),before.size()-1);

        before.remove(index);
        Assert.assertEquals(before,after);
    }




}

