package com.demoqa.pages.widgets;

import static utilities.JavaScriptUtility.scrollToElementJS;

import org.openqa.selenium.By;

import com.demoqa.pages.HomePage;

public class WidgetsPage extends HomePage {

    private By selectMenuMenuItem = By.xpath("//li[@id='item-8']/span[text()='Select Menu']");
    private By selectDatePickerItem = By.xpath("//li[@id='item-2']/span[text()='Date Picker']");

    public SelectMenuPage clickSelectMenu() {
        scrollToElementJS(selectMenuMenuItem);
        click(selectMenuMenuItem);
        return new SelectMenuPage();
    }
    
    public DatePickerPage clickDatePicker() {
        scrollToElementJS(selectDatePickerItem);
        click(selectDatePickerItem);
        return new DatePickerPage();
    }
}
