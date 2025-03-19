package part3_4.com.demoqa.test.part4.modals;

import org.testng.Assert;
import org.testng.annotations.Test;

import part3_4.com.demoqa.base.BaseTest;

public class SmallModalTest extends BaseTest {

    @Test
    public void smallModalTest () {
        var alertsPage = homePage.goToAlerts();
        var modalDialogsPage = alertsPage.clickModalDialogsMenu();
        modalDialogsPage.openSmallModal();
        String actualText = modalDialogsPage.getSmallModalText();
        Assert.assertTrue(actualText.contains("small modal"), "\n The message does not contain 'small modal' \n");
        modalDialogsPage.closeSmallModal();
    }
}
