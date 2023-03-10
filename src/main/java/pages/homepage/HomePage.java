package pages.homepage;

import common.BasePageActions;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePageActions {
    private static final Logger LOGGER = Logger.getLogger(HomePage.class);

    @CacheLookup
    @FindBy(className = "ico-register")
    private WebElement registerButton;

    @CacheLookup
    @FindBy(className = "ico-login")
    private WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "/html/body/div[4]/div[2]/div[1]/div[1]/ul/li[6]/a")
    private WebElement contactUsButton;


    public HomePage(WebDriver driver, int seconds) {
        super(driver, seconds);
        pageFactoryInitElement(driver, this);
    }

    public void clickOnLoginButton(){
        scrollOn(loginButton);
        clickOnElement(loginButton);
    }

    public void clickOnRegisterButton(){
        scrollOn(registerButton);
        clickOnElement(registerButton);
    }

    public void clickOnContactUsButton(){
        scrollOn(contactUsButton);
        clickOnElement(contactUsButton);
    }
}
