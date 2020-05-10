import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import steps.AbasSteps;
import steps.CriarContaSteps;
import steps.NovoPacoteSteps;

/*@FixMethodOrder(MethodSorters.NAME_ASCENDING)*/
public class TesteGandle {

    public void criarContaNoApp () throws Throwable {
        CriarContaSteps criaContaStep = new CriarContaSteps();
        AbasSteps abasSteps = new AbasSteps();
        NovoPacoteSteps novoPacoteSteps = new NovoPacoteSteps();

        criaContaStep.que_estou_na_tela_Nova_Conta();
        criaContaStep.preencher_todos_os_campos_corretamente();
        criaContaStep.clicar_no_botao_Criar_Conta();

        abasSteps.que_clico_na_aba_Pendentes();
        //abasSteps.clicar_na_aba_Entregues();
        abasSteps.valido_aba_Entregues();
        abasSteps.clico_na_aba_Arquivados();
        abasSteps.valido_aba_Arquivados();
        abasSteps.clico_na_aba_Tributados();
        abasSteps.valido_aba_Tributados();
        //abasSteps.clicar_na_aba_Entregues();
        abasSteps.clico_no_botao_Novo_Pacote();

        novoPacoteSteps.que_estou_na_tela_Novo_Pacote();
        novoPacoteSteps.insiro_o_codigo();
        novoPacoteSteps.o_nome_do_pacote();
        //novoPacoteSteps.seleciono_uma_categoria();
        novoPacoteSteps.insiro_uma_tag();
        novoPacoteSteps.clicar_no_botao_de_confirmar();
        abasSteps.que_clico_na_aba_Pendentes();
        novoPacoteSteps.valido_que_o_pacote_esta_listado_na_aba_entregues();
    }

    /*
    public void interargirAbas () throws Throwable {
        AbasSteps abasSteps = new AbasSteps();

        abasSteps.que_estou_na_aba_Pendentes();
        abasSteps.clicar_na_aba_Entregues();
        abasSteps.valido_aba_Entregues();
        abasSteps.clico_na_aba_Arquivados();
        abasSteps.valido_aba_Arquivados();
        abasSteps.clico_na_aba_Tributados();
        abasSteps.valido_aba_Tributados();
        abasSteps.clicar_na_aba_Entregues();
        abasSteps.clico_no_botao_Novo_Pacote();
    }

    public void criarPacoteRastreio () throws Throwable {
        NovoPacoteSteps novoPacoteSteps = new NovoPacoteSteps();
        AbasSteps abasSteps = new AbasSteps();


        novoPacoteSteps.que_estou_na_tela_Novo_Pacote();
        novoPacoteSteps.insiro_o_codigo();
        novoPacoteSteps.o_nome_do_pacote();
        //novoPacoteSteps.seleciono_uma_categoria();
        novoPacoteSteps.insiro_uma_tag();
        novoPacoteSteps.clicar_no_botao_de_confirmar();
        abasSteps.que_clico_na_aba_Pendentes();
        novoPacoteSteps.valido_que_o_pacote_esta_listado_na_aba_entregues();
    }

     */
}
