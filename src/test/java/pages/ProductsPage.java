package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    private WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Localizadores dinámicos (usan el nombre del producto)
    private By getAddToCartButton(String productName) {
        // Convierte "Sauce Labs Backpack" a "sauce-labs-backpack" para el ID
        String formattedName = productName.toLowerCase().replace(" ", "-");
        return By.id("add-to-cart-" + formattedName);
    }

    private By cartBadge = By.className("shopping_cart_badge");

    // Acciones
    public void addProductToCart(String productName) {
        driver.findElement(getAddToCartButton(productName)).click();
    }

    public String getCartBadgeCount() {
        return driver.findElement(cartBadge).getText();
    }
}