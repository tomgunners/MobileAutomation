package map;

import core.BaseScreen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import org.openqa.selenium.support.FindBy;

import java.time.temporal.ChronoUnit;

public class CriaContaElementMap extends BaseScreen {

    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    @AndroidFindBy(id="login_register")
    protected static MobileElement btnCriarConta;

    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    @FindBy(xpath="//*[contains(@text, 'Usu')]")
    protected static MobileElement campoUsuario;

    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    @FindBy(xpath="//*[@text='E-mail']")
    protected static MobileElement campoEmail;

    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    @FindBy(xpath="//*[@text='Senha']")
    protected static MobileElement campoSenha;

    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    @AndroidFindBy(id="register_confirm")
    protected static MobileElement btnConfirma;
}
