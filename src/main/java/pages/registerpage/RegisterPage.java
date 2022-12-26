package pages.registerpage;

import common.BasePageActions;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import util.EmailGenerator;

import java.time.LocalDateTime;

public class RegisterPage extends BasePageActions {

    private static Logger LOGGER = Logger.getLogger(RegisterPage.class);

    @CacheLookup
    @FindBy(id= "gender-male")
    private WebElement genderMale;

    @CacheLookup
    @FindBy(id= "gender-female")
    private WebElement genderFemale;

    @CacheLookup
    @FindBy(id= "FirstName")
    private WebElement firstName;

    @CacheLookup
    @FindBy(id= "LastName")
    private WebElement lastName;

    @CacheLookup
    @FindBy(id= "Email")
    private WebElement email;

    @CacheLookup
    @FindBy(id= "Password")
    private WebElement password;

    @CacheLookup
    @FindBy(id= "ConfirmPassword")
    private WebElement confirmPassword;

    @CacheLookup
    @FindBy(id= "register-button")
    private WebElement registerConfirmButton;

    @CacheLookup
    @FindBy(className= "result")
    private WebElement confirmRegistrationMessage;

    @CacheLookup
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[1]/span[2]/span")
    private WebElement passwordMessage;

    public RegisterPage(WebDriver driver, int seconds) {
        super(driver, seconds);
        pageFactoryInitElement(driver, this);
    }

    public void fillRegisterForm(){
        try{
            scrollOn(genderMale);
            clickOnElement(genderMale);
            scrollOn(firstName);
            typeOnTextField(firstName, "Steven");
            scrollOn(lastName);
            typeOnTextField(lastName, "Duque");
            scrollOn(email);
            typeOnTextField(email, EmailGenerator.generateEmail());
            scrollOn(password);
            typeOnTextField(password,"123456789");
            scrollOn(confirmPassword);
            typeOnTextField(confirmPassword, "123456789");
            scrollOn(registerConfirmButton);
            clickOnElement(registerConfirmButton);
        }catch (Exception e){
            LOGGER.error("Error al registrar usuario");
        }

    }

    public void fillRegisterFormWrong(){
        try{
            scrollOn(genderMale);
            clickOnElement(genderMale);
            scrollOn(firstName);
            typeOnTextField(firstName, "Steven");
            scrollOn(lastName);
            typeOnTextField(lastName, "Duque");
            scrollOn(email);
            typeOnTextField(email, EmailGenerator.generateEmail());
            scrollOn(password);
            typeOnTextField(password,"12345");
            scrollOn(confirmPassword);
            typeOnTextField(confirmPassword, "12345");
            scrollOn(registerConfirmButton);
            clickOnElement(registerConfirmButton);
        }catch (Exception e){
            LOGGER.error("Error al registrar usuario");
        }

    }

    public String getTextRegistrationCompleted(){
        return getTextFromElement(confirmRegistrationMessage);
    }

    public String getTextPasswordMessage(){
        return getTextFromElement(passwordMessage);
    }

    public boolean isPasswordMessageDisplayed(){
        return isDisplayed(passwordMessage);
    }
}
