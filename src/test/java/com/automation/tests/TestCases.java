package com.automation.tests;

import org.testng.annotations.Test;

public class TestCases extends TestBase {

    @Test
    public void testCase() {

        homePage.goToLoginPage()
                .makeLogin("workshop@gmail.com", "1236974")
                .verifyLoggedIn();

    }

    @Test
    public void testCase2() {

        homePage.goToLoginPage()
                .makeLogin("workshop@gmail.com", "1236974")
                .verifyLoggedIn();


    }

    @Test
    public void testCase3() {

        homePage.goToLoginPage()
                .makeLogin("workshop@gmail.com", "1236974")
                .verifyLoggedIn();


    }

    @Test
    public void testCase4() {

        homePage.goToLoginPage()
                .makeLogin("workshop@gmail.com", "1236974")
                .verifyLoggedIn();


    }
}
