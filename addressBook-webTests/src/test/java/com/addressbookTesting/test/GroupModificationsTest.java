package com.addressbookTesting.test;

import com.addressbookTesting.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;

/**
 * Created by anastasiyam on 2/6/2017.
 */
public class GroupModificationsTest extends TestBase {

@Test
    public void testGroupModification(){

    app.goToGroup().GroupPage();

    if(! app.getGroupHelper().isThereGroup()){
        app.getGroupHelper().create(new GroupData().withName("test1"));
    }
    List<GroupData> before=app.getGroupHelper().list();
    int index=before.size()-1;
    //using cascades
    GroupData groupMod=new GroupData()
            .withId(before.get(index).getId()).withName("test1").withHeader("test2").withFooter("test3");
    //int before= app.getGroupHelper().getGroupCount();
    app.getGroupHelper().modifiedGroup(index,groupMod);
    List<GroupData> after=app.getGroupHelper().list();
    //int after= app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after.size(),before.size());
    //check if both list are consistent
    //before.remove(before.size()-1);
    // Множества: неупорядоченные коллекции
    before.remove(index);
    before.add(groupMod);

    Comparator<? super GroupData> byId=(g1,g2)->Integer.compare(g1.getId(),g2.getId());
    before.sort(byId);
    after.sort(byId);
    //Assert.assertEquals(new HashSet<Object>(before),new HashSet<Object>(after));
    Assert.assertEquals(after,before);

}


}
