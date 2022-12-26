package stepdefinitions.register;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import pages.homepage.HomePage;
import pages.registerpage.RegisterPage;
import stepdefinitions.setup.BaseTestPage;



public class RegisterSteps extends BaseTestPage {

    private static final Logger LOGGER = Logger.getLogger(RegisterSteps.class);

    @Given("a que el usuario ingreso a la opcion de registro")
    public void aQueElUsuarioIngresoALaOpcionDeRegistro() {
        try{
            setUpLog4j2();
            setUpWebDriver();
            generalSetUp();
            HomePage homePage = new HomePage(driver,10);
            homePage.clickOnRegisterButton();
            LOGGER.info("Usuario ingresó al área de registro");
        }catch (Exception e){
            LOGGER.error("Error en la ejecución del test: " + e.getMessage());
            Assertions.fail("Error en la ejecución del test: " + e.getMessage());
            quitDriver();

        }
    }
    @When("diligencie el formulario de registro correctamente")
    public void diligencieElFormularioDeRegistroCorrectamente() {
        try{
            RegisterPage registerPage = new RegisterPage(driver, 5);
            registerPage.fillRegisterForm();
            LOGGER.info("Usuario diligenció el formulario de registro correctamente");
        }catch (Exception e){
            LOGGER.error("Error en la ejecución del test: " + e.getMessage());
            Assertions.fail("Error en la ejecución del test: " + e.getMessage());
            quitDriver();
        }

    }




    @Then("el usuario recibira un mensaje de que su cuenta fue registrada correctamente")
    public void elUsuarioRecibiraUnMensajeDeQueSuCuentaFueRegistradaCorrectamente() {
        try{
            RegisterPage registerPage = new RegisterPage(driver, 5);
            Assertions.assertEquals("Your registration completed", registerPage.getTextRegistrationCompleted());
            LOGGER.info("Mensaje de confirmación de registro esperado correcto");
            quitDriver();
        }catch (Exception e){
            LOGGER.error("Error en la ejecución del test: " + e.getMessage());
            Assertions.fail("Error en la ejecución del test: " + e.getMessage());
            quitDriver();
        }
    }
}
