package helper;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumDriverHelper {

    private static AndroidDriver<MobileElement> driver;

    public static AndroidDriver<MobileElement> getDriver(){
        if (driver == null) {
            createDriver();
        }
        return driver;
    }

    public static void createDriver() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 6000);
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:/Users/Tom_G/IdeaProjects/MobileAutomation/src/main/resources/Muambator.apk");
        //desiredCapabilities.setCapability("appPackage", "br.com.muambator.android.ui.activity.ListPackageActivity");
        //desiredCapabilities.setCapability("appActivity", "br.com.muambator.android.br.com.muambator.android.ui.activity.ListPackageActivity");
        desiredCapabilities.setCapability("noReset", true);

        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_WAIT_PACKAGE, "br.com.muambator.android");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, "br.com.muambator.android.ui.activity.LoginActivity");


        try {
            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        } catch (MalformedURLException e){
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void killDriver(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }
}
