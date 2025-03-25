package part3_4.com.demoqa.test.part4.dynamicwait;

import org.testng.Assert;
import org.testng.annotations.Test;

import part3_4.com.demoqa.base.BaseTest;

public class DynamicWaitTest extends BaseTest {


    public void testVisibleAfterButtonText() {
        var dynamicPage = homePage.goToElements().clickDynamicProperties();
        String actualText = dynamicPage.getVisibleAfterButtonText();
        String expectedText = "Visible After 5 Seconds";
        Assert.assertEquals(actualText, expectedText, "Actual and Expected text do not match.");
    }

    @Test
    public void testProgressBar() {
        var progressBarPage = homePage.goToWidgets().clickProgressBarMenu();
        progressBarPage.clickStartButton();
        String actualValue = progressBarPage.getProgressValue();
        String expectedValue = "100%";
        Assert.assertEquals(actualValue, expectedValue, "Progress Bar is not at 100%.");
        
    }

}
