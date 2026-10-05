package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver driver;

    private final By campoUsuario = By.id("user-name");
    private final By campoSenha = By.id("password");
    private final By botaoLogin = By.id("login-button");
    private final By titulo = By.className("title");
    private final By mensagemErro = By.cssSelector("[data-test='error']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void abrir() {
        driver.get("https://www.saucedemo.com");
    }

    public void preencherLogin(String usuario, String senha) {
        driver.findElement(campoUsuario).sendKeys(usuario);
        driver.findElement(campoSenha).sendKeys(senha);
    }

    public void clicarLogin() {
        driver.findElement(botaoLogin).click();
    }

    public String obterTitulo() {
        return driver.findElement(titulo).getText();
    }

    public String obterMensagemErro() {
        return driver.findElement(mensagemErro).getText();
    }
}