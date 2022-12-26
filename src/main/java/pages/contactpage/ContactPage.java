package pages.contactpage;

import common.BasePageActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends BasePageActions {

    @CacheLookup
    @FindBy(id= "")
    private WebElement name;

    @CacheLookup
    @FindBy(id= "")
    private WebElement email;

    @CacheLookup
    @FindBy(id= "")
    private WebElement enquiry;

    @CacheLookup
    @FindBy(id= "")
    private WebElement submitButton;


    public ContactPage(WebDriver driver, int seconds) {
        super(driver, seconds);
        pageFactoryInitElement(driver, this);
    }

    private void submitContactInfo(){
        scrollOn(name);
        typeOnTextField(name,"Steven Duque");
        scrollOn(email);
        typeOnTextField(email, "stevenduque@mail.com");
        scrollOn(enquiry);
        typeOnTextField(enquiry, "You are the best web shop ever");
        scrollOn(submitButton);
        clickOnElement(submitButton);
    }
}
