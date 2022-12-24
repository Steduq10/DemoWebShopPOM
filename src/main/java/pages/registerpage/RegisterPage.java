package pages.registerpage;

import common.BasePageActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePageActions {

    @CacheLookup
    @FindBy(id= "")
    private WebElement gender;

    @CacheLookup
    @FindBy(id= "")
    private WebElement firstName;

    @CacheLookup
    @FindBy(id= "")
    private WebElement lastName;

    @CacheLookup
    @FindBy(id= "")
    private WebElement email;

    @CacheLookup
    @FindBy(id= "")
    private WebElement password;

    @CacheLookup
    @FindBy(id= "")
    private WebElement confirmPassword;

    @CacheLookup
    @FindBy(id= "")
    private WebElement registerConfirmButton;

    @CacheLookup
    @FindBy(id= "")
    private WebElement confirmRegistrationMessage;

    public RegisterPage(WebDriver driver, int seconds) {
        super(driver, seconds);
        pageFactoryInitElement(driver, this);
    }

    public void fillRegisterForm(){
        scrollOn(firstName);
        typeOnTextField(firstName, "Steven");
        scrollOn(lastName);
        typeOnTextField(lastName, "Duque");
        scrollOn(email);
        typeOnTextField(email, "stevenduque@mail.com");
        scrollOn(password);
        typeOnTextField(password,"123456789");
        scrollOn(confirmPassword);
        typeOnTextField(confirmPassword, "123456789");
        scrollOn(registerConfirmButton);
        clickOnElement(registerConfirmButton);
    }
}
