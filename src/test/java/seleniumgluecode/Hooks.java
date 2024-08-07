package seleniumgluecode;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;
import utils.Configuration;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class Hooks {
    Configuration configuration = new Configuration();
    private static WebDriver driver;
    private DriverManager driverManager;

    @Before
    public void setUp() throws Exception {
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.manage().timeouts().implicitlyWait(configuration.getWaitSecond(), TimeUnit.SECONDS);
        driver.get(configuration.getUrl());
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot)driverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot,"image/png");
        }
        driverManager.quitDriver();
    }
    public static WebDriver getDriver(){
        return driver;
    }
}
