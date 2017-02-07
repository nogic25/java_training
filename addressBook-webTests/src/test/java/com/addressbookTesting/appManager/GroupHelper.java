package com.addressbookTesting.appManager;

import com.addressbookTesting.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by anastasiyam on 2/2/2017.
 */
public class GroupHelper extends HelperBase {

    public GroupHelper(FirefoxDriver wd) {
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
        type(By.name("group_name"), groupData.getHeader());
        type(By.name("group_name"), groupData.getFooter());

    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    //this method can be used by methods from the same class or by methods enherited the class
    public void deleteSelectedGroups() {
        click(By.name("delete"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

    public void initGroupModification() {click(By.name("edit"));}
    public void submitGroupModification() {click(By.name("update"));}


}
