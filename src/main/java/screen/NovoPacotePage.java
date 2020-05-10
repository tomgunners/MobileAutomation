package screen;

import map.NovoPacoteElementMap;
import org.openqa.selenium.By;

public class NovoPacotePage extends NovoPacoteElementMap {


    public boolean validaTelaNovoPacote(){
        return existeElementoPorTexto("Novo pacote");
    }

    //Codigo
    public void inserirCodigo(String codigo) {
        campoCodigoObrigatorio.sendKeys(codigo);
    }

    //Nome
    public void inserirNome(String nome) {
        campoNome.sendKeys(nome);
    }

    // Clicar no Combo
    public void clicarCombo(){
        comboBoxCategoria.click();
    }

    //Selecionar Opcao Combo
    public void selecionarCombo (String valor){
        selecionaCombo(By.id(String.valueOf(selecionaCategoria)), valor);
    }

    //Tag
    public void inserirTag(String tag) {
        campoTag.sendKeys(tag);
    }

    // Confirma Novo Pacote
    public void clicaBotaoNovoPacote(){
        btnConfirmaNovoPacote.click();
    }

    public boolean validaPacoteListado(){
        return existeElementoPorTexto("TESTE DE PACOTE");
    }
}
