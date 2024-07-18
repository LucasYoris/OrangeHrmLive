package pom;

import org.openqa.selenium.By;

public class LoginPage {

    private static final By usernameInput = By.name("username");
    private static final By passwordInput = By.name("password");
    private static final By submitButton = By.xpath("//button[@type='submit']");


    public static By getUsernameInput() {
        return usernameInput;
    }
    public static By getPasswordInput() {
        return passwordInput;
    }
    public static By getSubmitButton() {
        return submitButton;
    }


}
