package com.addressbookTesting.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by anastasiyam on 2/2/2017.
 */
public class NavigationGroup extends HelperBase{
    private FirefoxDriver wd;

    public NavigationGroup(FirefoxDriver wd) {
        super(wd);
    }

    public void goToGroupPage() {
        click(By.linkText("groups"));
    }
}


