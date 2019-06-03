package com.automation.pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage goToHomePage(){
        driver.get("http://automationpractice.com/index.php");
        return this;
    }
}
