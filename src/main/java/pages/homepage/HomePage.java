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
    @FindBy(name = "login")
    private WebElement loginButton;

    @CacheLookup
    @FindBy(name = "contact")
    private WebElement contactUsButton;


    public HomePage(WebDriver driver, int seconds) {
        super(driver, seconds);
        pageFactoryInitElement(driver, this);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }

    public void clickOnContactUsButton(){
        clickOnElement(contactUsButton);
    }
}
