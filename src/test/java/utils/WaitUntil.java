package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import seleniumgluecode.BaseTest;

import java.time.Duration;

public class WaitUntil {

    public static boolean present(By locator) throws Exception {
        Configuration configuration = new Configuration();
        return present(locator, configuration.getWaitSecond());
    }

    public static boolean present(By locator, int seconds) throws Exception {
        boolean exist = false;
        Duration duration = Duration.ofSeconds(seconds);
        try {
            WebDriverWait wait = new WebDriverWait(BaseTest.getDriver(), duration);
            exist = wait.until(ExpectedConditions.and(
                    ExpectedConditions.presenceOfElementLocated(locator),
                    ExpectedConditions.visibilityOfElementLocated(locator),
                    ExpectedConditions.elementToBeClickable(locator)));
        } catch (NoSuchElementException | TimeoutException e) {
            e.printStackTrace();
        }
        return exist;
    }
}
