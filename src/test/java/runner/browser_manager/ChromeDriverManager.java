package runner.browser_manager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager extends DriverManager {

    @Override
    protected void createDriver() {
        WebDriverManager.chromedriver().clearResolutionCache().clearDriverCache().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
    }
}
