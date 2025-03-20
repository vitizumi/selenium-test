package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

    public static void setAlertText(String promptField) {
        switchTo().alert().sendKeys(promptField);
    }

    public static void switchToFrameString(String value) {
        switchTo().frame(value);
    }

    public static void switchToFrameIndex(int index) {
        switchTo().frame(index);
    }

    public static void switchToFrameWebElement(WebElement element) {
        switchTo().frame(element);
    }   

    public static void switchToDefaultContent() {
        switchTo().defaultContent();
    }
}
