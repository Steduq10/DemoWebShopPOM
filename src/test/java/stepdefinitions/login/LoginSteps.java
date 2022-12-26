package stepdefinitions.login;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import pages.homepage.HomePage;
import pages.loginpage.LoginPage;
import stepdefinitions.setup.BaseTestPage;

import static org.hamcrest.MatcherAssert.assertThat;


public class LoginSteps extends BaseTestPage {
    private static final Logger LOGGER = Logger.getLogger(LoginSteps.class);
    @Given("a que el usuario ingreso a la opcion de login")
    public void aQueElUsuarioIngresoALaOpcionDeLogin() {
        try {
            setUpLog4j2();
            setUpWebDriver();
            generalSetUp();
            HomePage homePage = new HomePage(driver,10);
            homePage.clickOnLoginButton();
            LOGGER.info("Usuario ingresó al área de login");
        }catch (Exception e){
            LOGGER.error("Error en la ejecución del test: " + e.getMessage());
            Assertions.fail("Error en la ejecución del test: " + e.getMessage());
            quitDriver();
        }
    }

    @When("diligencie el formulario de login correctamente con email y password")
    public void diligencieElFormularioDeLoginCorrectamenteConEmailYPassword() {
        try{
            LoginPage loginPage = new LoginPage(driver,5);
            loginPage.loginForm();
            LOGGER.info("Usuario diligenció el formulario de login correctamente");
        }catch (Exception e){
            LOGGER.error("Error en la ejecución del test: " + e.getMessage());
            Assertions.fail("Error en la ejecución del test: " + e.getMessage());
            quitDriver();
        }
    }


    @Then("el usuario ingresa al menu principal del sitio web")
    public void elUsuarioIngresaAlMenuPrincipalDelSitioWeb() {
        try {
            LoginPage loginPage = new LoginPage(driver,5);
            Assertions.assertTrue(loginPage.isHomePageDisplayed());
            LOGGER.info("Dirigido al menú principal correctamente");
            quitDriver();

        }catch (Exception e){
            LOGGER.error("Error en la ejecución del test: " + e.getMessage());
            Assertions.fail("Error en la ejecución del test: " + e.getMessage());
            quitDriver();

        }
    }

    @When("diligencie el formulario de login  con email y password no registrado o incorrecto")
    public void diligencieElFormularioDeLoginConEmailYPasswordNoRegistradoOIncorrecto() {
        try{
            LoginPage loginPage = new LoginPage(driver,5);
            loginPage.loginFormWrong();
            LOGGER.info("Usuario diligenció el formulario de login con email y password no registrado o incorrecto");
        }catch (Exception e){
            LOGGER.error("Error en la ejecución del test: " + e.getMessage());
            Assertions.fail("Error en la ejecución del test: " + e.getMessage());
            quitDriver();
        }
    }

    @Then("se muestra en pantalla un mensaje de que el login no fue exitoso")
    public void seMuestraEnPantallaUnMensajeDeQueElLoginNoFueExitoso() {
        try {
            LoginPage loginPage = new LoginPage(driver,5);
            Assertions.assertEquals("Login was unsuccessful. Please correct the errors and try again.", loginPage.incorrectLoginMessage());
            LOGGER.info("Se muestra el mensaje de login no exitoso");
            quitDriver();

        }catch (Exception e){
            LOGGER.error("Error en la ejecución del test: " + e.getMessage());
            Assertions.fail("Error en la ejecución del test: " + e.getMessage());
            quitDriver();

        }
    }


}
