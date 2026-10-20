package support;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
    // Variable estática para que los Steps puedan acceder al mismo driver
    public static WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        // Configurar opciones para que Chrome funcione en modo Headless (CI/CD)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new"); // Ejecuta Chrome sin interfaz gráfica
        options.addArguments("--no-sandbox"); // Necesario para entornos Linux/CI
        options.addArguments("--disable-dev-shm-usage"); // Evita problemas de memoria compartida
        options.addArguments("--window-size=1920,1080"); // Define un tamaño de pantalla virtual

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}