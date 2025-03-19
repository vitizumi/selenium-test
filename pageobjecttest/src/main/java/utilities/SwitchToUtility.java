package utilities;

import org.openqa.selenium.WebDriver;

public class SwitchToUtility extends Utility {

    private static WebDriver.TargetLocator switchTo () {
        return driver.switchTo();
    }

    public static String getAlertText () {
        //change context to alert so it can use getText
        return switchTo().alert().getText();
    }

    public static void acceptAlert () {
        switchTo().alert().accept();
    }

    public static void dismissAlert() {
        switchTo().alert().dismiss();
    }
}
