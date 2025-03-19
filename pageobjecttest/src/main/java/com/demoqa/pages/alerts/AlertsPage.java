package com.demoqa.pages.alerts;

import static utilities.JavaScriptUtility.scrollToElementJS;

import org.openqa.selenium.By;

import com.demoqa.pages.HomePage;

public class AlertsPage extends HomePage {
    private By modalDialogsMenuItem = By.xpath("//li[@id='item-4']/span[text()='Modal Dialogs']");
    private By alertsMenuItem = By.xpath("//li[@id='item-1']/span[text()='Alerts']");

    public ModalDialogsPage clickModalDialogsMenu () {
        scrollToElementJS(modalDialogsMenuItem);
        click(modalDialogsMenuItem);
        return new ModalDialogsPage();
    }

    public AlertsBoxPage clickAlertsMenu () {
        scrollToElementJS(alertsMenuItem);
        click(alertsMenuItem);
        return new AlertsBoxPage();
    }
}
