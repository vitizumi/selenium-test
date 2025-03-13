package com.demoqa.pages.elements;

import static utilities.JavaScriptUtility.clickJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

import org.openqa.selenium.By;

public class WebTablesPage extends ElementsPage {

    private By searchBoxField = By.id("searchBox");
    private By editWebTableRow = By.xpath("//span[@title='Edit']");
    private By ageRegistrationField = By.id("age");
    private By submitRegistrationButton = By.id("submit");

    public void searchBoxWebTable(String searchWord) {
        scrollToElementJS(searchBoxField);
        set(searchBoxField, searchWord);
    }

    public void clickEditWebTableRecord() {
        scrollToElementJS(editWebTableRow);
        clickJS(editWebTableRow);

    }

    public void editRecordByEmail(String email) {
        searchBoxWebTable(email);
        clickEditWebTableRecord();

    }

    public void setAge(String age) {
        set(ageRegistrationField, age);
    }

    public void submitRegistration() {
        click(submitRegistrationButton);
    }
    
    public String getTableAge(String email) {
        By tableAge = By.xpath("//div[text()='"+ email +"']//preceding::div[1]");
        return find(tableAge).getText();
    }
}
