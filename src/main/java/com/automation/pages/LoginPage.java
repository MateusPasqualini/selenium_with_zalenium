package com.automation.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage extends BasePage {

    private By emailField = By.id("email");
    private By passwordField = By.id("passwd");
    private By signInButton = By.id("SubmitLogin");
    private By profileIcon = By.cssSelector("a[title=\"View my customer account\"]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage makeLogin(String email, String password) {
        writeText(emailField, email);
        writeText(passwordField, password);
        click(signInButton);
        return this;
    }

    public LoginPage verifyLoggedIn() {
        Assert.assertEquals(readText(profileIcon), "Tester Workshop");
        return this;
    }


}
