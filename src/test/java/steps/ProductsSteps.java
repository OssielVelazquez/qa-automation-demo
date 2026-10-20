package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.ProductsPage;
import support.Hooks;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductsSteps {
    private WebDriver driver = Hooks.driver;
    private LoginPage loginPage = new LoginPage(driver);
    private ProductsPage productsPage = new ProductsPage(driver);

    @Given("el usuario ha iniciado sesión en SauceDemo")
    public void elUsuarioHaIniciadoSesion() {
        driver.get("https://www.saucedemo.com/");
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
    }

    @When("agrega el producto {string} al carrito")
    public void agregaElProductoAlCarrito(String productName) {
        productsPage.addProductToCart(productName);
    }

    @Then("el contador del carrito debería mostrar {string}")
    public void elContadorDelCarritoDeberiaMostrar(String expectedCount) {
        assertEquals(expectedCount, productsPage.getCartBadgeCount(),
                "El contador del carrito no coincide");
    }
}