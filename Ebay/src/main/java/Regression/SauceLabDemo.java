package Regression;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.URL;



public class SauceLabDemo {

    public static WebDriver driver;

    public static final String USERNAME = "suprokash";
    public static final String ACCESS_KEY = "0f65e4a1-e293-4dfc-bac7-ad88ed3c1c3d";
    public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";


    @Parameters ({"platform","browser","version"})
    public static void main(String args []) throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platform", "Windows");
        capabilities.setCapability("platform_version", "10");
        capabilities.setCapability("browser", "chrome");
        capabilities.setCapability("browser_version", "76.0");
        capabilities.setCapability("resolution", "1024x768");
        driver = new RemoteWebDriver(new URL(URL), capabilities);

        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.findElement(By.name("q")).sendKeys("Cloud Automation");
        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
        System.out.println(driver.getTitle());

        driver.quit();
        System.out.println("Test Completed");
    }

}
