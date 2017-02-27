package com.addressbookTesting.test;

import com.addressbookTesting.appManager.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Created by anastasiyam on 2/2/2017.
 */
public class TestBase {
    //delegetion instead of inheritance. In order to accomplish this will be build a new reference to the object

    //static fuction can be called by any classes
    protected static final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);


    @BeforeSuite
    // here we first conducted inheritance and then delegetion. Apparently object of the ApplicationManager class runs certain methods
    public void setUp() throws Exception {
        // System.setProperty("webdriver.gecko.driver", "C://Windows/geckodriver.exe");
        app.init();
    }

    @AfterSuite
    public void tearDown() {
        app.stop();
    }


}