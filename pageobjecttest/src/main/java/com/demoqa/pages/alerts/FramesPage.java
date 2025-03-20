package com.demoqa.pages.alerts;

import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.SwitchToUtility.*;

import org.openqa.selenium.By;

public class FramesPage extends AlertsPage {

    private By headerFramesText = By.xpath("//div[@id='app']//h1[text()='Frames']");
    private By textInFrame = By.id("sampleHeading");
    private String iFrameBigBox = "frame1";
    private By iFrameSmallBox = By.xpath("//div[@id='frame2Wrapper']/iframe");

    private void switchToBigBox () {
        switchToFrameString(iFrameBigBox);
    }

    private void switchToSmallBox () {
        //switchToFrameIndex(3);
        scrollToElementJS(iFrameSmallBox);
        switchToFrameWebElement(find(iFrameSmallBox));
    }

    public String getTextInBigFrame () {
        switchToBigBox();
        String bigFrameText = find(textInFrame).getText();
        System.out.println("Big Frame Text: " + bigFrameText);
        switchToDefaultContent();
        return bigFrameText;
    }

    public String getTextInSmallFrame () {
        switchToSmallBox();
        String smallFrameText = find(textInFrame).getText();
        System.out.println("Small Frame Text: " + smallFrameText);
        switchToDefaultContent();
        return smallFrameText;
    }

    public String getHeaderFrameText () {
        return find(headerFramesText).getText();
    }

}
