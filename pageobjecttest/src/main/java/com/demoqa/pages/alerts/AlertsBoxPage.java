package com.demoqa.pages.alerts;

import org.openqa.selenium.By;

public class AlertsBoxPage extends AlertsPage {
    private By alertDefaultButton = By.id("alertButton");
    private By alertConfirmButton = By.id("confirmButton");
    private By alertConfirmResults = By.id("confirmResult");
    private By alertPromptButton = By.id("promtButton");
    private By alertPromptResults = By.id("promptResult");

    public void clickAlertDefaultButton () {
        click(alertDefaultButton);
    }

    public void clickAlertConfirmButton () {
        click(alertConfirmButton);
    }

    public String getAlertConfirmResult () {
        return find(alertConfirmResults).getText();
    }
    
    public void clickAlertPromptButton () {
        click(alertPromptButton);
    }

    public String getAlertPromptResult () {
        return find(alertPromptResults).getText();
    }
}
