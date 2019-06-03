package com.automation.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utils.DriverManagers;

public class TestBase {

    protected WebDriver driver;

    @BeforeMethod
    @Parameters(value = {"browser"})
    public void setup(@Optional String browser) {
        driver = DriverManagers.setDriver(browser);
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
