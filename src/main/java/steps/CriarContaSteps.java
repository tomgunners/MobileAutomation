package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import screen.AbasPage;
import screen.CriarContaPage;

import java.net.MalformedURLException;

import static org.junit.Assert.assertEquals;


public class CriarContaSteps {

    private CriarContaPage criarContaPage = new CriarContaPage();
    private AbasPage abasPage = new AbasPage();

    @Given("^que estou na tela Nova Conta$")
    public void que_estou_na_tela_Nova_Conta() throws MalformedURLException {
        criarContaPage.clicarBotaoCriarSuaConta();
        assertEquals("Nova conta", CriarContaPage.obterValor());
    }

    @When("^preencher todos os campos corretamente$")
    public void preencher_todos_os_campos_corretamente() {
        criarContaPage.clicarCampoUsuario();
        criarContaPage.inserirUsuario("TESTMOBILEPROJECT1");
        criarContaPage.inserirEmail("yenia8563@inserver.tk");
        criarContaPage.inserirSenha("12345678");
    }

    @When("^clicar no botao Criar Conta$")
    public void clicar_no_botao_Criar_Conta()  {
        criarContaPage.clicarBotaoCriarConta();
    }

    @Then("^deve redirecionar para a tela principal do app$")
    public void deve_redirecionar_para_a_tela_principal_do_app() {
        Assert.assertTrue(abasPage.validaAbaPendetes());
    }
}
