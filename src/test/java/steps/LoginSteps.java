package steps;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Então;
import pages.LoginPage;

public class LoginSteps {
    private LoginPage loginPage;

    @Dado("que estou na tela de login")
    public void queEstouNaTelaDeLogin() {
        loginPage = new LoginPage(Hooks.driver);
        loginPage.abrir();
    }

    @Quando("informo o usuário {string} e a senha {string}")
    public void informoUsuarioESenha(String usuario, String senha) {
        loginPage.preencherLogin(usuario, senha);
    }

    @E("clico no botão de login")
    public void clicoNoBotaoDeLogin() {
        loginPage.clicarLogin();
    }

    @Então("devo ver a página de produtos")
    public void devoVerAPaginaDeProdutos() {
        assertEquals("Products", loginPage.obterTitulo());
    }

    @Então("devo ver a mensagem de erro {string}")
    public void devoVerAMensagemDeErro(String mensagem) {
        assertEquals(mensagem, loginPage.obterMensagemErro());
    }
}