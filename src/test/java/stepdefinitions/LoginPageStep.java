package stepdefinitions;

import Actions.LoginPageAction;
import Factory.DriverFactory;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginPageStep {

    private WebDriver driver;
    LoginPage loginPage;
    LoginPageAction loginPageAction;

    @Given("eu esteja no tela de login")
    public void eu_esteja_no_tela_de_login() {
        driver = DriverFactory.getDriver();
        loginPage = new LoginPage(driver);
        driver.get(loginPage.url);
        loginPageAction = new LoginPageAction(driver);
    }
    @When("digitar login e senha")
    public void digitar_login_e_senha() {
        loginPageAction.login();
    }
    @Then("a tela sera exibida")
    public void a_tela_sera_exibida() {
        loginPageAction.validarPaginaProdutos();
    }

}
