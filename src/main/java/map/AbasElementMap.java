package map;

import core.BaseScreen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.time.temporal.ChronoUnit;

public class AbasElementMap extends BaseScreen {

    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    @FindBy(xpath="//*[@text='PENDENTES']")
    protected static MobileElement abaPendetes;

    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    @FindBy(xpath="//*[@text='ENTREGUES']")
    protected static MobileElement abaEntregues;

    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    @FindBy(xpath="//*[@text='ARQUIVADOS']")
    protected static MobileElement abaArquivados;

    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    @FindBy(xpath="//*[@text='TRIBUTADOS']")
    protected static MobileElement abaTributados;

    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    @AndroidFindBy(id="fab")
    protected static MobileElement btnNovoPacote;
}
