package pages.loginpage;

import common.BasePageActions;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.EmailGenerator;

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
    //@FindBy(className = "button-1 login-button")
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
    private WebElement logInButton;

    @CacheLookup
    @FindBy(className = "topic-html-content-header")
    private WebElement homePage;

    @CacheLookup
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/span")
    private WebElement incorrectLoginMessage;

    public LoginPage(WebDriver driver, int seconds) {
        super(driver, seconds);
        pageFactoryInitElement(driver, this);
    }

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginForm(){
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

    public void loginFormWrong(){
        try {
            scrollOn(email);
            typeOnTextField(email, EmailGenerator.generateEmail());
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
    public void loadHomePage(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOf(logInButton));
    }

    public boolean isHomePageDisplayed(){
        return isDisplayed(homePage);
    }

    public String incorrectLoginMessage(){
        return getTextFromElement(incorrectLoginMessage);
    }
}
