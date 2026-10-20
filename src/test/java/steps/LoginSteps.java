package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import support.Hooks;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginSteps {
    private WebDriver driver = Hooks.driver;
    private LoginPage loginPage = new LoginPage(driver);

    @Given("el usuario está en la página de login de SauceDemo")
    public void elUsuarioEstaEnLaPaginaDeLogin() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("ingresa el usuario {string} y la contraseña {string}")
    public void ingresaCredenciales(String usuario, String password) {
        loginPage.enterUsername(usuario);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
    }

    @Then("debería ver la página de productos")
    public void deberiaVerPaginaDeProductos() {
        assertTrue(driver.getCurrentUrl().contains("inventory.html"), "No se redirigió a la página de inventario");
    }

    @Then("debería ver un mensaje de error indicando credenciales inválidas")
    public void deberiaVerMensajeDeError() {
        String error = loginPage.getErrorMessage();
        assertTrue(error.contains("Username and password do not match"), "El mensaje de error no es el esperado");
    }
}