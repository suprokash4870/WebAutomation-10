package Regression;

import Base.SetUp;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static java.lang.Thread.sleep;

public class EbaySignIn extends SetUp {

    @FindBy(xpath = "//*[@id=\"gh-ug\"]/a")
    WebElement SignIn;

    @FindBy(id= "userid")
    WebElement UserId;

    @FindBy(name= "pass")
    WebElement PassWord;

    @FindBy(xpath = "//*[@type='submit']")
    WebElement SignInButton;

    public void SignInVerification(String userName,String Pass) throws InterruptedException {

        SignIn.click();
        sleep (3);
        UserId.sendKeys(userName);
        sleep(3);
        PassWord.sendKeys(Pass);
        sleep(3);
        SignInButton.click();
    }
}
