package pages.loginpage;

import common.BasePageActions;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePageActions {

    private static Logger LOGGER = Logger.getLogger(LoginPage.class);

    @CacheLookup
    @FindBy(id= "Email")
    private WebElement email;

    @CacheLookup
    @FindBy(id= "Password")
    private WebElement password;

    @CacheLookup
    @FindBy(id= "RememberMe")
    private WebElement rememberMe;

    @CacheLookup
    @FindBy(xpath= "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
    private WebElement logInButton;

    public LoginPage(WebDriver driver, int seconds) {
        super(driver, seconds);
        pageFactoryInitElement(driver, this);
    }

    private void loginForm(){
        try {
            scrollOn(email);
            typeOnTextField(email, "stevenduque@mail.com");
            scrollOn(password);
            typeOnTextField(password, "123456789");
            scrollOn(rememberMe);
            clickOnElement(rememberMe);
            scrollOn(logInButton);
            clickOnElement(logInButton);
        }catch (Exception e){
            LOGGER.error("Error al loguearse");
        }

    }
}
