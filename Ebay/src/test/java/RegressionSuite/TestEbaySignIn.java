package RegressionSuite;

import Base.SetUp;
import Regression.EbaySignIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestEbaySignIn extends SetUp {

    EbaySignIn ebaySignin;
    //String url = "https://www.ebay.com/";

    @BeforeMethod
    public void init(){
        ebaySignin = PageFactory.initElements(driver,EbaySignIn.class);
        driver.get("https://www.ebay.com");
    }

    @Test
    public void SignInVerificationTest() throws InterruptedException {
        ebaySignin.SignInVerification("ssanyalashok","suprokash8071");
    }

    @AfterMethod
    public void CloseApp()
    {
        //driver.quit();
    }


}
