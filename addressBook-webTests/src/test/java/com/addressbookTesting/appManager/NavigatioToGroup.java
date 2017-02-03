package com.addressbookTesting.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by anastasiyam on 2/2/2017.
 */
public class NavigatioToGroup {
    private FirefoxDriver wd;

    public NavigatioToGroup(FirefoxDriver wd) {
        this.wd=wd;
    }

    public void goToGroupPage() {
        wd.findElement(By.linkText("groups")).click();
    }
}
