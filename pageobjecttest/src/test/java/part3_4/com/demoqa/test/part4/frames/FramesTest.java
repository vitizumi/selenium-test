package part3_4.com.demoqa.test.part4.frames;

import org.testng.Assert;
import org.testng.annotations.Test;

import part3_4.com.demoqa.base.BaseTest;

public class FramesTest extends BaseTest {

    @Test
    public void testFramesBigBox () {
        var framesPage = homePage.goToAlerts().clickFramesMenu();
        String actualBigBoxText = framesPage.getTextInBigFrame();
        String expectedBigBoxText = "This is a sample page";

        Assert.assertEquals(actualBigBoxText, expectedBigBoxText, "Actual and Expected text do not match.");
        
        String actualHeaderText = framesPage.getHeaderFrameText();
        String expectedHeaderText = "Frames";

        Assert.assertEquals(actualHeaderText, expectedHeaderText);
    }

    @Test
    public void testFramesSmallBox () {
        var framesPage = homePage.goToAlerts().clickFramesMenu();
        String actualSmallBoxText = framesPage.getTextInSmallFrame();
        String expectedSmallBoxText = "This is a sample page";

        Assert.assertEquals(actualSmallBoxText, expectedSmallBoxText, "Actual and Expected text do not match.");

        String actualHeaderText = framesPage.getHeaderFrameText();
        String expectedHeaderText = "Frames";

        Assert.assertEquals(actualHeaderText, expectedHeaderText);
    }

}
