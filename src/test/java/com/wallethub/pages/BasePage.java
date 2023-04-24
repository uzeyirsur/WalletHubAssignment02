package com.wallethub.pages;

import com.wallethub.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage {
    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver,10 );

    public BasePage(){
        PageFactory.initElements(driver,this);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    }
}
