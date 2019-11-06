package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;


public class SetUp {

    public static WebDriver driver;

    @Parameters({"platform", "url", "browser"})

    @BeforeClass

    public static WebDriver getLocalDriver(String platform, String url, String browser) {
        if (platform.equalsIgnoreCase("mac") && browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "..\\Generic\\src\\main\\resources\\Driver\\chromedriver");
        } else if (platform.equalsIgnoreCase("windows") && browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "..\\Generic\\src\\main\\resources\\Driver\\chromedriver.exe");
        }
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);

        return driver;
    }

    @AfterClass
    public void CloseApp() {
        //driver.close();
        //driver.quit();
    }
}
