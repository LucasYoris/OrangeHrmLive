package seleniumgluecode.testCasesSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pom.HomePage;
import pom.LoginPage;
import seleniumgluecode.BaseTest;
import utils.WaitUntil;

import static utils.RandomNumbers.getRandomNumber;


public class Registro extends BaseTest {

    @Given("^el usuario realiza el login con usuario \"([^\"]*)\" y password \"([^\"]*)\"$")
    public void elUsuarioRealizaElLoginConUsuarioYPassword(String username, String password) throws Throwable {
        WaitUntil.present(LoginPage.getUsernameInput());
        driver.findElement(LoginPage.getUsernameInput()).sendKeys(username);
        driver.findElement(LoginPage.getPasswordInput()).sendKeys(password);
        driver.findElement(LoginPage.getSubmitButton()).click();
    }

    @And("^el usuario agrega un nuevo usuario$")
    public void elUsuarioAgregaUnNuevoUsuario() throws Exception {
        WaitUntil.present(HomePage.getadminButton());
        driver.findElement(HomePage.getadminButton()).click();
        driver.findElement(HomePage.getadminButton()).click();
        WaitUntil.present(HomePage.getAddUserButton());
        driver.findElement(HomePage.getAddUserButton()).click();
    }

    @And("^el usuario carga los datos del nuevo usuario \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void elUsuarioCargaLosDatosDelNuevoUsuario(String userRole, String employeeName, String status, String username, String password) throws Throwable {
        WaitUntil.present(HomePage.getuserRoleSelect());
        driver.findElement(HomePage.getuserRoleSelect()).click();
        driver.findElement(HomePage.selectOption(userRole)).click();
        driver.findElement(HomePage.getemployeeNameInput()).sendKeys(employeeName);
        driver.findElement(HomePage.selectOption(employeeName)).click();
        driver.findElement(HomePage.getstatusSelect()).click();
        driver.findElement(HomePage.selectOption(status)).click();
        driver.findElement(HomePage.getusernameInput()).sendKeys(username+getRandomNumber(1,999999));
        driver.findElement(HomePage.getpasswordInput()).sendKeys(password);
        driver.findElement(HomePage.getconfirmPasswordInput()).sendKeys(password);
        driver.findElement(HomePage.getsaveButton()).click();
    }

    @Then("^Se debe verificar el mensaje de succesfully saved$")
    public void seDebeVerificarElMensajeDeSuccesfullySaved() throws Exception {
        Assert.assertTrue("No se encontro el pop up 'Successfully saved'",WaitUntil.present(HomePage.getsuccessfullySavedPopUp()));
    }


}
