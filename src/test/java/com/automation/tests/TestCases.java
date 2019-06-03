package com.automation.tests;

import com.automation.pages.HomePage;

import org.testng.annotations.Test;

public class TestCases extends TestBase {
    private HomePage homePage;

    @Test
    public void testCase() {
        homePage = new HomePage(getDriver());

        homePage.goToHomePage();
    }

    @Test
    public void testCase2() {
        homePage = new HomePage(getDriver());

        homePage.goToHomePage();
    }

}
