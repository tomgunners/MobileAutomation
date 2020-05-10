package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import screen.AbasPage;
import screen.NovoPacotePage;

public class NovoPacoteSteps {

    private NovoPacotePage novoPacotePage = new NovoPacotePage();
    private AbasPage abasPage = new AbasPage();

    @Given("^que estou na tela Novo Pacote$")
    public void que_estou_na_tela_Novo_Pacote() {
        novoPacotePage.validaTelaNovoPacote();
    }

    @And("^insiro o codigo$")
    public void insiro_o_codigo(){
        novoPacotePage.inserirCodigo("LL764344175CN");
    }

    @And("^o nome do pacote$")
    public void o_nome_do_pacote() {
        novoPacotePage.inserirNome("TESTE DE PACOTE");
    }

    /*@And("^seleciono uma categoria$")
    public void seleciono_uma_categoria() {
        novoPacotePage.clicarCombo();
        novoPacotePage.selecionarCombo("sem categoria");
    }*/

    @And("^insiro uma tag$")
    public void insiro_uma_tag() {
        novoPacotePage.inserirTag("TESTE");
    }

    @When("^clicar no botao de confirmar$")
    public void clicar_no_botao_de_confirmar()  {
        novoPacotePage.clicaBotaoNovoPacote();
    }

    /*@And("^que clico na aba Pendentes$")
    public void que_clico_na_aba_Pendentes() {
        abasPage.clicarAbaPendetes();
    }*/

    @Then("^valido que o pacote esta listado na aba entregues$")
    public void valido_que_o_pacote_esta_listado_na_aba_entregues() {
        novoPacotePage.validaPacoteListado();
    }
}
