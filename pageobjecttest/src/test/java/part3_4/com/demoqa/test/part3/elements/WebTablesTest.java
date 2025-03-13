package part3_4.com.demoqa.test.part3.elements;

import static com.base.BasePage.delay;

import org.testng.Assert;
import org.testng.annotations.Test;

import part3_4.com.demoqa.base.BaseTest;

public class WebTablesTest extends BaseTest {

    @Test
    public void testUpdateTable() {
        String email = "alden@example.com";
        String expectedAge = "21";

        var elementsPage = homePage.goToElements().clickWebTables();
        elementsPage.editRecordByEmail(email);
        elementsPage.setAge("21");
        elementsPage.submitRegistration();
        String actualAge = elementsPage.getTableAge(email);
        Assert.assertEquals(actualAge, expectedAge, "\n Actual & expected age do not match \n");
    }
}
