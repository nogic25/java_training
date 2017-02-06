package com.addressbookTesting.appManager;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by anastasiyam on 2/2/2017.
 */
public class ApplicationManager  {

    FirefoxDriver wd;
//to delegate methods to specific classes. First create class, extend class, pull members up, replace inheritance to delegation
// refactor. Create a new reference to the class object, create the constructor
    private  ContactHelper contactHelper;
    private SessionHelper sessionHelper;
    private NavigationGroup navigatioToGroup;
    private GroupHelper groupHelper;
    private NavigationToContact navigationToContact;



        public void init() {
            wd = new FirefoxDriver();
            wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            wd.get("http://localhost/addressbook/group.php");
            groupHelper = new GroupHelper(wd);
            navigatioToGroup = new NavigationGroup(wd);
            sessionHelper=new SessionHelper(wd);
            contactHelper = new ContactHelper(wd);
            navigationToContact=new NavigationToContact(wd);
            //login
            sessionHelper.login("admin","secret");
    }

  
    public void stop() {
        wd.quit();
    }
//methods which are used in tests
    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationGroup getNavigationToGroup() {
        return navigatioToGroup;
    }

    public ContactHelper getContactHelper() {return contactHelper;}

    public NavigationToContact getNavigationToContact() {return navigationToContact;}
}

