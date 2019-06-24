package com.automation.tests;

import com.automation.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utils.DriverManagers;

import static utils.DriverManagers.getTLDriver;

public class TestBase {

    protected WebDriver driver;
    protected HomePage homePage;
    @BeforeMethod
    @Parameters(value = {"browser"})
    public synchronized void setup(@Optional String browser) {
        DriverManagers.setTLDriver(browser);
        homePage = new HomePage(getTLDriver());

    }

    @AfterMethod
    public synchronized void teardown() {
        getTLDriver().quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
