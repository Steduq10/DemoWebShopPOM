package pages.loginpage;

import common.BasePageActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePageActions {

    @CacheLookup
    @FindBy(id= "")
    private WebElement email;

    @CacheLookup
    @FindBy(id= "")
    private WebElement password;

    @CacheLookup
    @FindBy(id= "")
    private WebElement rememberMe;

    @CacheLookup
    @FindBy(id= "")
    private WebElement logInButton;

    public LoginPage(WebDriver driver, int seconds) {
        super(driver, seconds);
        pageFactoryInitElement(driver, this);
    }

    private void loginForm(){
        scrollOn(email);
        typeOnTextField(email, "stevenduque@mail.com");
        scrollOn(password);
        typeOnTextField(password, "123456789");
        scrollOn(rememberMe);
        clickOnElement(rememberMe);
        scrollOn(logInButton);
        clickOnElement(logInButton);
    }
}
