package Actions;

import Pages.LoginPage;
import Utils.ConfigReader;
import org.openqa.selenium.WebDriver;

public class LoginPageAction {

    WebDriver driver;
    LoginPage loginPage;

    public LoginPageAction(WebDriver driver) {
        this.driver = driver;
        loginPage = new LoginPage(driver);
    }

    public void login() {
        loginPage.userName.sendKeys(ConfigReader.getUsername());
        loginPage.password.sendKeys(ConfigReader.getPassword());
        loginPage.loginButton.click();

    }
    public void validarPaginaProdutos() {
        String title = driver.getTitle();
        if (title.equals("Swag Labs")) {
            System.out.println("Página encontrada com sucesso");
        }else {
            System.out.println("Erro ao abrir página");
        }
    }
}
