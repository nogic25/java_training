package com.addressbookTesting.test;

import com.addressbookTesting.appManager.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by anastasiyam on 2/2/2017.
 */
public class TestBase {
//delegetion instead of inheritance. In order to accomplish this will be build a new reference to the object
    protected final ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp() throws Exception {
       // System.setProperty("webdriver.gecko.driver", "C://Windows/geckodriver.exe");
        app.init();
    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }

}
