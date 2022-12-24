package stepdefinitions.register;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import pages.homepage.HomePage;
import stepdefinitions.setup.BaseTestPage;



public class RegisterSteps extends BaseTestPage {

    private static final Logger LOGGER = Logger.getLogger(RegisterSteps.class);
    @Given("a que el cliente ingresó a la opción de registro")
    public void aQueElClienteIngresóALaOpciónDeRegistro() {
        try{
            setUpLog4j2();
            setUpWebDriver();
            generalSetUp();
            HomePage homePage = new HomePage(driver,10);
            homePage.clickOnRegisterButton();
        }catch (Exception e){
            LOGGER.error("Error en la ejecución del test: " + e.getMessage());
            Assertions.fail("Error en la ejecución del test: " + e.getMessage());
            quitDriver();

        }
    }

    @When("diligencie el formulario de registro correctamente")
    public void diligencieElFormularioDeRegistroCorrectamente() {
    }

    @Then("el usuario recibirá un mensaje de que su cuenta fue registrada correctamente")
    public void elUsuarioRecibiráUnMensajeDeQueSuCuentaFueRegistradaCorrectamente() {
    }
}
