package com.addressbookTesting.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by anastasiyam on 2/2/2017.
 */
public class NavigationHelper extends HelperBase{
    private FirefoxDriver wd;

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void goToHomePage(){

        if(isElementPresent(By.id("maintable")))
        {return;}
        click(By.linkText("home"));
    }

    public void GroupPage() {
        if (isElementPresent(By.tagName("h1"))
             //   && wd.findElement(By.tagName("h1")).getText().equals("Groups")
            && isElementPresent(By.name("new")))
        {return;}
        click(By.linkText("groups"));
    }


    public void goToAddContact() {
        click(By.linkText("add new"));

    }

    public void returnToHomePage() {click(By.linkText("home page"));
    }
}


