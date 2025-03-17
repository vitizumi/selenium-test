package part3_4.com.demoqa.test.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;

import part3_4.com.demoqa.base.BaseTest;

public class DateTest extends BaseTest {

    @Test
    public void testSelectingDate() {
        String month = "May";
        String monthNumber = "05";
        String day = "22";
        String year = "2043";
        
        var datePickerPage = homePage.goToWidgets().clickDatePicker();
        datePickerPage.clickSelectDate();
        datePickerPage.selectMonth(month);
        datePickerPage.selectYear(year);
        datePickerPage.clickDay(day);

        String actualDate = datePickerPage.getDate();
        String expectedDate = monthNumber + "/" + day + "/" + year;
        Assert.assertEquals(actualDate, expectedDate, "\n Actual and Expected dates do not match." + 
                                                        "\n Actual date:  " + actualDate + 
                                                        "\n Expected date:  " + expectedDate + " \n");
    }

}
