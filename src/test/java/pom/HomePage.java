package pom;

import org.openqa.selenium.By;

public class HomePage {

    private static final By adminButton = By.xpath("(//ul/li[1])[1]");
    private static final By AddUserButton = By.xpath("//button[contains(., 'Add')]");
    private static final By userRoleSelect = By.xpath("//label[text()='User Role']/following::div[1]");
    private static final By employeeNameInput = By.xpath("//label[text()='Employee Name']/following::input[1]");
    private static final By statusSelect = By.xpath("//label[text()='Status']/following::div[1]");
    private static final By usernameInput = By.xpath("//label[text()='Username']/following::input[1]");
    private static final By passwordInput = By.xpath("//label[text()='Password']/following::input[1]");
    private static final By confirmPasswordInput = By.xpath("//label[text()='Confirm Password']/following::input[1]");
    private static final By saveButton = By.xpath("//button[text()=' Save ']");
    private static final By successfullySavedPopUp = By.xpath("//div/p[text()='Successfully Saved']");



    public static By getadminButton() {
        return adminButton;
    }
    public static By getAddUserButton() {
        return AddUserButton;
    }
    public static By getuserRoleSelect() {
        return userRoleSelect;
    }
    public static By getemployeeNameInput() {
        return employeeNameInput;
    }
    public static By getstatusSelect() {
        return statusSelect;
    }
    public static By getusernameInput() {
        return usernameInput;
    }
    public static By getpasswordInput() {
        return passwordInput;
    }
    public static By getconfirmPasswordInput() {
        return confirmPasswordInput;
    }
    public static By getsaveButton() {
        return saveButton;
    }
    public static By selectOption(String option){
        return By.xpath("//div/span[text()='"+option+"']");
    }
    public static By getsuccessfullySavedPopUp() {
        return successfullySavedPopUp;
    }



}
