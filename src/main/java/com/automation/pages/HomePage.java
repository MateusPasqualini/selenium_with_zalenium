package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    private By singInButton = By.cssSelector("a[class=\"login\"]");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public LoginPage goToLoginPage() {
        driver.get("http://automationpractice.com/index.php");
        click(singInButton);
        return new LoginPage(driver);
    }
}
