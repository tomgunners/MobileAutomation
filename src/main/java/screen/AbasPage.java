package screen;

import map.AbasElementMap;

public class AbasPage extends AbasElementMap {

    public boolean validaAbaPendetes(){
        return existeElementoPorTexto("PENDENTES");
    }

    public void clicarAbaPendentes() {
        abaPendetes.click();
    }

    public boolean validaAbaEntregues(){
        return existeElementoPorTexto("ENTREGUES");
    }

    public void clicarAbaEntregues() {
        abaEntregues.click();
    }

    public boolean validaAbaArquivados(){
        return existeElementoPorTexto("ARQUIVADOS");
    }

    public void clicarAbaArquivados() {
        abaArquivados.click();
    }

    public boolean validaAbaTributados(){
        return existeElementoPorTexto("TRIBUTADOS");
    }

    public void clicarAbaTributados() {
        abaTributados.click();
    }

    public void clicarBotaoNovoPacote(){
        btnNovoPacote.click();
    }

}
