package part3_4.com.demoqa.test.part4.windows;

import org.testng.Assert;
import org.testng.annotations.Test;

import part3_4.com.demoqa.base.BaseTest;
import static utilities.GetUtility.*;

public class WindowsTest extends BaseTest {

    @Test
    public void testNewWindowsURL () {
        var windowsPage = homePage.goToAlerts().clickBrowserwindowsMenu();
        windowsPage.clickNewWindowButton();
        windowsPage.switchToNewWindow();
        String actualURL = getURL();
        String expectedURL = "https://demoqa.com/sample";

        Assert.assertEquals(actualURL, expectedURL, "Actual and Expected URL do not match.");
    }

}
