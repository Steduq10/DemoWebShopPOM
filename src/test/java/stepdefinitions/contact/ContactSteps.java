package stepdefinitions.contact;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import pages.contactpage.ContactPage;
import pages.homepage.HomePage;
import pages.loginpage.LoginPage;
import stepdefinitions.login.LoginSteps;
import stepdefinitions.setup.BaseTestPage;

public class ContactSteps extends BaseTestPage {

    private static final Logger LOGGER = Logger.getLogger(LoginSteps.class);
    @Given("a que el usuario ingreso a la opcion de contact us")
    public void aQueElUsuarioIngresoALaOpcionDeContactUs() {
        try {
            setUpLog4j2();
            setUpWebDriver();
            generalSetUp();
            HomePage homePage = new HomePage(driver,10);
            homePage.clickOnContactUsButton();
            LOGGER.info("Ingresó correctamente al área de Contact Us");
        }catch (Exception e){
            LOGGER.error("Error en la ejecución del test: " + e.getMessage());
            Assertions.fail("Error en la ejecución del test: " + e.getMessage());
            quitDriver();
        }
    }

    @When("diligencie el formulario de contact correctamente")
    public void diligencieElFormularioDeContactCorrectamente() {
        try{
            ContactPage contactPage = new ContactPage(driver,5);
            contactPage.submitContactInfo();
            LOGGER.info("Formulario diligenciado correctamente");

        }catch (Exception e){
            LOGGER.error("Error en la ejecución del test: " + e.getMessage());
            Assertions.fail("Error en la ejecución del test: " + e.getMessage());
            quitDriver();
        }
    }

    @Then("recibe un mensaje de confirmacion de la correcta generacion del P.Q.R.S")
    public void recibeUnMensajeDeConfirmacionDeLaCorrectaGeneracionDelPQRS() {
        try {
            ContactPage contactPage = new ContactPage(driver,5);
            Assertions.assertEquals("Your enquiry has been successfully sent to the store owner.", contactPage.getTextConfirmationMessage());
            LOGGER.info("Mensaje de confirmación esperado correcto");
            quitDriver();

        }catch (Exception e){
            LOGGER.error("Error en la ejecución del test: " + e.getMessage());
            Assertions.fail("Error en la ejecución del test: " + e.getMessage());
            quitDriver();

        }
    }
}
