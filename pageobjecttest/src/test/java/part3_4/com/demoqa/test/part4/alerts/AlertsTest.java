package part3_4.com.demoqa.test.part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;

import part3_4.com.demoqa.base.BaseTest;

import static utilities.SwitchToUtility.*;

public class AlertsTest extends BaseTest {

    @Test
    public void testInformationAlert() {
        String expectedAlertText = "You clicked a button";
        var alertsPage = homePage.goToAlerts().clickAlertsMenu();
        alertsPage.clickAlertDefaultButton();
        Assert.assertEquals(getAlertText(), expectedAlertText, "\\n Actual & Expected Messages do not match. \\n");
        acceptAlert();
    }

    @Test
    public void testConfirmationAlert() {
        var alertsPage = homePage.goToAlerts().clickAlertsMenu();
        alertsPage.clickAlertConfirmButton();
        dismissAlert();
        String actualConfirmationResult = alertsPage.getAlertConfirmResult();
        String expectedConfirmationResult = "You selected Cancel";

        Assert.assertEquals(actualConfirmationResult, expectedConfirmationResult, "\n You did not select Cancel \n");
    }

    @Test
    public void testPromptAlert() {
        String expectedResults = "testprompt";
        var alertsPage = homePage.goToAlerts().clickAlertsMenu();
        alertsPage.clickAlertPromptButton();
        setAlertText(expectedResults);
        acceptAlert();
        String actualResults = alertsPage.getAlertPromptResult();
        Assert.assertTrue(actualResults.contains(expectedResults), "\n Prompt Response does not match what was typed \n");
    }
}
