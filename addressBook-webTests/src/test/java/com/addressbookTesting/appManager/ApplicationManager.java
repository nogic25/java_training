package com.addressbookTesting.appManager;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by anastasiyam on 2/2/2017.
 */
public class ApplicationManager {
    FirefoxDriver wd;


    private SessionHelper sessionHelper;
    private  NavigatioToGroup navigatioToGroup;
    private GroupHelper groupHelper;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

        public void init() {
            wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            wd.get("http://localhost/addressbook/group.php");
            groupHelper = new GroupHelper(wd);
            navigatioToGroup = new NavigatioToGroup(wd);
            sessionHelper=new SessionHelper(wd);
            //login
            sessionHelper.login("admin","secret");
    }

  
    public void stop() {
        wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigatioToGroup getNavigatioToGroup() {
        return navigatioToGroup;
    }
}
