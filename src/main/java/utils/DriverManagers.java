package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DriverManagers {


    private static final Logger logger = Logger.getLogger(DriverManagers.class.getName());


    private DriverManagers() {
    }

    private static ThreadLocal<RemoteWebDriver> tlDriver = new ThreadLocal<>();

    public static synchronized void setTLDriver(String browser) {
        if (browser.equals("firefox")) {
            try {
                WebDriverManager.firefoxdriver().setup();
                tlDriver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), OptionsManager.getFirefoxOptions()));
            } catch (MalformedURLException e) {
                logger.log(Level.SEVERE, "Endereço especificado não encontrado");
            }
        } else if (browser.equals("chrome")) {
            try {
                WebDriverManager.chromedriver().setup();
                tlDriver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), OptionsManager.getChromeOptions()));
            } catch (MalformedURLException e) {
                logger.log(Level.SEVERE, "Endereço especificado não encontrado");
            }
            }
        }

    public static synchronized WebDriver getTLDriver() {
        return tlDriver.get();
    }

    public static synchronized void shutdownThread() {
        tlDriver.remove();
    }
}
