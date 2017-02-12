package com.addressbookTesting.appManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * Created by anastasiyam on 2/2/2017.
 */
public class ApplicationManager  {
    private final String browser;
    WebDriver wd;

//to delegate methods to specific classes. First create class, extend class, pull mempublic ApplicationManager(String ) {

// refactor. Create a new reference to the class object, create the constructor
    private  ContactHelper contactHelper;
    private SessionHelper sessionHelper;
    private NavigationHelper navigatioToGroup;
    private GroupHelper groupHelper;
    private String firefox;

    public ApplicationManager(String browser) {
        this.browser= browser;
    }


    public void init() {
               if(Objects.equals(browser, BrowserType.FIREFOX)){
                   wd = new FirefoxDriver();
               }else if (Objects.equals(browser, BrowserType.CHROME)){
                   wd = new ChromeDriver();
               }else if (Objects.equals(browser, BrowserType.IE)){
                   wd = new InternetExplorerDriver();
               }

            wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            wd.get("http://localhost/addressbook/group.php");
            groupHelper = new GroupHelper(wd);
            navigatioToGroup = new NavigationHelper(wd);
            sessionHelper=new SessionHelper(wd);
            contactHelper = new ContactHelper(wd);

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

    public NavigationHelper getNavigationToGroup() {
        return navigatioToGroup;
    }

    public ContactHelper getContactHelper() {return contactHelper;}

}

