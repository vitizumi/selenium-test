package com.demoqa.pages.widgets;

import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.DropDownUtility.*;

import org.openqa.selenium.By;

public class DatePickerPage extends WidgetsPage {

    private By selectDateField = By.id("datePickerMonthYearInput");
    private By monthDropDown = By.cssSelector(".react-datepicker__month-select");
    private By yearDropDown = By.className("react-datepicker__year-select");
    
    private By dayValue(String day) {
        return By.xpath("//div[contains(@class, 'react-datepicker__day react-datepicker__day--')][text()='"+ day +"']");
    }

    public void clickDay(String day) {
        click(dayValue(day));
    }

    public boolean isDayInMonth(String day) {
        return find(dayValue(day)).isDisplayed();
    }

    public void clickSelectDate() {
        scrollToElementJS(selectDateField);
        click(selectDateField);
    }

    public String getDate() {
        return find(selectDateField).getAttribute("value");
    }

    public void selectMonth(String month) {
        selectByVisibleText(monthDropDown, month);
    }
    
    public void selectYear(String year) {
        selectByVisibleText(yearDropDown, year);
    }
}
