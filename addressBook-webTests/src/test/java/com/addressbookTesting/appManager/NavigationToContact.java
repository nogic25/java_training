package com.addressbookTesting.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by anastasiyam on 2/5/2017.
 */
public class NavigationToContact extends HelperBase {

    private FirefoxDriver wd;

    public NavigationToContact(FirefoxDriver wd) {

        super(wd);
    }


    public void goToAddContact() {
        click(By.linkText("add new"));

    }
}