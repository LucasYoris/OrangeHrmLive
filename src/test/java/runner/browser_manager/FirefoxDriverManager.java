package runner.browser_manager;

import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxOptions;


public class FirefoxDriverManager extends DriverManager {

    @Override
    protected void createDriver() {
        WebDriverManager.firefoxdriver().clearResolutionCache().clearDriverCache().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("-private");
        driver = new FirefoxDriver(options);
    }
}
