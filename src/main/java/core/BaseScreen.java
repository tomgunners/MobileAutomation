package core;

import helper.AppiumDriverHelper;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;

import static helper.AppiumDriverHelper.getDriver;

public class BaseScreen {

    public BaseScreen(){

        PageFactory.initElements( new AppiumFieldDecorator(getDriver(), Duration.ofSeconds(500)  ), this );
    }

    public void clicar(By by){
        getDriver().findElement(by).click();
    }

    public void clicarPorTexto(String texto){
        clicar(By.xpath("//*[@text='"+texto+"']"));
    }

    public static String obterTexto(By by){
        return getDriver().findElement(by).getText();
    }

    public void selecionaCombo(By by, String valor){
        getDriver().findElement(by).click();
        clicarPorTexto(valor);
    }

    public boolean existeElementoPorTexto (String texto){
        List<MobileElement> elementos = getDriver().findElements(By.xpath("//*[@text='"+texto+"']"));
        return elementos.size() > 0;
    }

}
