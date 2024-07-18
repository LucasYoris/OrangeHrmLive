package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration; // Importa la clase Duration


public class BaseTest {
    protected static WebDriver driver = Hooks.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Utiliza Duration.ofSeconds

    public static WebDriver getDriver(){
      return driver;
    };
}

