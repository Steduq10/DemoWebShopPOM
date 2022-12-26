package pages.contactpage;

import common.BasePageActions;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends BasePageActions {

    private static Logger LOGGER = Logger.getLogger(ContactPage.class);
    @CacheLookup
    @FindBy(id= "FullName")
    private WebElement name;

    @CacheLookup
    @FindBy(id= "Email")
    private WebElement email;

    @CacheLookup
    @FindBy(id= "Enquiry")
    private WebElement enquiry;

    @CacheLookup
    @FindBy(xpath= "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[3]/form/div[3]/input")
    private WebElement submitButton;


    public ContactPage(WebDriver driver, int seconds) {
        super(driver, seconds);
        pageFactoryInitElement(driver, this);
    }

    private void submitContactInfo(){
        try{
            scrollOn(name);
            typeOnTextField(name,"Steven Duque");
            scrollOn(email);
            typeOnTextField(email, "stevenduque@mail.com");
            scrollOn(enquiry);
            typeOnTextField(enquiry, "You are the best web shop ever");
            scrollOn(submitButton);
            clickOnElement(submitButton);
        }catch (Exception e){
            LOGGER.error("Error al llenar los campo de contacto");
        }

    }
}
