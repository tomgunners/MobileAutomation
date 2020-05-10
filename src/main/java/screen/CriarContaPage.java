package screen;

import map.CriaContaElementMap;
import org.openqa.selenium.By;


public class CriarContaPage extends CriaContaElementMap {

    //Crie sua Conta
    public void clicarBotaoCriarSuaConta()  {
        btnCriarConta.click();
    }

    public static String obterValor(){
        return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Nova conta')]"));
    }

    public void clicarCampoUsuario()  {
        campoUsuario.click();
    }

    //Usuario
    public void inserirUsuario(String usuario) {
        campoUsuario.sendKeys(usuario);
    }

    //E-mail
    public void inserirEmail(String email) {
        campoEmail.sendKeys(email);
    }

    //Senha
    public void inserirSenha(String senha) {
        campoSenha.sendKeys(senha);
    }

    //Botão Criar Sua Conta
    public void clicarBotaoCriarConta() {
        btnConfirma.click();
    }
}
