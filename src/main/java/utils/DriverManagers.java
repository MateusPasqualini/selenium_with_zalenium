package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.openqa.selenium.remote.BrowserType.CHROME;
import static org.openqa.selenium.remote.BrowserType.FIREFOX;

public class DriverManagers {

    private DriverManagers(){
        throw new IllegalStateException("DriverManagers class cannot be instantiated");
    }

    public static WebDriver setDriver(String driverType) {
        WebDriver driverManager = null;

        if (driverType.equals(CHROME)) {
            WebDriverManager.chromedriver().setup();
            driverManager = new ChromeDriver(OptionsManager.getChromeOptions());
        } else if (driverType.equals(FIREFOX)) {
            WebDriverManager.firefoxdriver().setup();
            driverManager = new FirefoxDriver(OptionsManager.getFirefoxOptions());
        }
        return driverManager;
    }
}
