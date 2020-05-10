package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import screen.AbasPage;

public class AbasSteps {

    private AbasPage abasPage = new AbasPage();

    @Given("^que clico na aba Pendentes$")
    public void que_clico_na_aba_Pendentes() throws Throwable {
        abasPage.clicarAbaPendentes();
    }

    @And("^valido aba Pendentes$")
    public void valido_aba_Pendentes() throws Throwable {
        Assert.assertTrue(abasPage.validaAbaPendetes());    }

    @And("^clico na aba Entregues$")
    public void clico_na_aba_Entregues() throws Throwable {
        abasPage.clicarAbaEntregues();    }

    @And("^valido aba Entregues$")
    public void valido_aba_Entregues() throws Throwable {
        Assert.assertTrue(abasPage.validaAbaEntregues());
    }

    @And("^clico na aba Arquivados$")
    public void clico_na_aba_Arquivados() throws Throwable {
        abasPage.clicarAbaArquivados();    }

    @And("^valido aba Arquivados$")
    public void valido_aba_Arquivados() throws Throwable {
        Assert.assertTrue(abasPage.validaAbaArquivados());

    }

    @And("^clico na aba Tributados$")
    public void clico_na_aba_Tributados() throws Throwable {
        abasPage.clicarAbaTributados();
    }

    @And("^valido aba Tributados$")
    public void valido_aba_Tributados() throws Throwable {
        Assert.assertTrue(abasPage.validaAbaTributados());
    }

    @When("^clicar na aba Pendentes$")
    public void clicar_na_aba_Pendentes() throws Throwable {
        abasPage.clicarAbaPendentes();
    }

    @Then("^clico no botao Novo Pacote$")
    public void clico_no_botao_Novo_Pacote() throws Throwable {
        abasPage.clicarBotaoNovoPacote();
    }
}
