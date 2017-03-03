package com.addressbookTesting.appManager;

import com.addressbookTesting.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anastasiyam on 2/2/2017.
 */
public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver wd) {
        super(wd);
    }

    //Refactoring is highlighting of support Methods
    public void returnToGroupPage() {
            wd.findElement(By.linkText("group page")).click();
        }
//optimize the code. Repeatable items should be moved to the new methods with parameters
    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());

    }

    public void delete(int index) {
        selectGroup(index);
        deleteSelectedGroups();
        returnToGroupPage();
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    //this method can be used by methods from the same class or by methods enherited the class
    public void deleteSelectedGroups() {
        click(By.name("delete"));
    }

    public void selectGroup(int index ) {
        wd.findElements(By.name("selected[]")).get(index).click();

    }

    public void initGroupModification() {click(By.name("edit"));}
    public void submitGroupModification() {click(By.name("update"));}


    public void create(GroupData group) {
        initGroupCreation();
        fillGroupForm(group);
        submitGroupCreation();
        returnToGroupPage();
    }

    public void modifiedGroup(int index, GroupData groupMod) {
        selectGroup(index);
        initGroupModification();
        //obtain ID from the lest group
        fillGroupForm(groupMod);
        submitGroupModification();
        returnToGroupPage();
    }


    public boolean isThereGroup() {
        return (isElementPresent(By.name("selected[]")));
    }

    public int getGroupCount() {
        return wd.findElements(By.name("selected[]")).size();
    }

    public List<GroupData> list() {
        List<GroupData>groups=new ArrayList<GroupData>();
        List<WebElement>elements=wd.findElements(By.cssSelector("span.group"));
        for (WebElement element:elements){
            String name=element.getText();

            //convert String type to int -use Integer.parseInt
           int id=Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            groups.add(new GroupData().withId(id).withName(name));
        }
        return groups;
    }



}
