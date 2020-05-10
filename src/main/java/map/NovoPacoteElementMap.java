package map;

import core.BaseScreen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.time.temporal.ChronoUnit;

public class NovoPacoteElementMap extends BaseScreen {

    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    @AndroidFindBy(id="create_codigo")
    protected static MobileElement campoCodigoObrigatorio;

    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    @AndroidFindBy(id="create_nome")
    protected static MobileElement campoNome;

    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    @AndroidFindBy(id="create_category")
    protected static MobileElement comboBoxCategoria;

    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    @AndroidFindBy(id="category_name")
    protected static MobileElement selecionaCategoria;

    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    @AndroidFindBy(id="create_tag_text")
    protected static MobileElement campoTag;

    @WithTimeout(time = 5, chronoUnit = ChronoUnit.SECONDS)
    @AndroidFindBy(id="menu_check")
    protected static MobileElement btnConfirmaNovoPacote;
}
