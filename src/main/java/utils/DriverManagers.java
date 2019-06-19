package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static org.openqa.selenium.remote.BrowserType.CHROME;
import static org.openqa.selenium.remote.BrowserType.FIREFOX;

public class DriverManagers {

    private DriverManagers() {
        throw new IllegalStateException("DriverManagers class cannot be instantiated");
    }

    public static WebDriver setDriver(String driverType) {
        RemoteWebDriver driverManager = null;

        if (driverType.equals(CHROME)) {
            WebDriverManager.chromedriver().setup();
            try {
                driverManager = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), OptionsManager.getChromeOptions());
            } catch (MalformedURLException e) {
                System.out.println("");
            }
        } else if (driverType.equals(FIREFOX)) {
            WebDriverManager.firefoxdriver().setup();
            try {
                driverManager = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), OptionsManager.getFirefoxOptions());
            } catch (MalformedURLException e) {
                System.out.println("");
            }
        }
        return driverManager;
    }
}
