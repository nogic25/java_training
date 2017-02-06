package com.addressbookTesting.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by anastasiyam on 2/2/2017.
 */
public class SessionHelper extends HelperBase {


    public SessionHelper(FirefoxDriver wd) {
        super(wd);
    }


    public void login(String userName, String password) {

        type(By.name("user"),userName);
        type(By.name("pass"),password);

       click(By.xpath("//form[@id='LoginForm']/input[3]"));
    }

}