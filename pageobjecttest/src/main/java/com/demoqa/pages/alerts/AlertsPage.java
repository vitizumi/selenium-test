package com.demoqa.pages.alerts;

import static utilities.JavaScriptUtility.scrollToElementJS;

import org.openqa.selenium.By;

import com.demoqa.pages.HomePage;

public class AlertsPage extends HomePage {
    private By modalDialogsMenuItem = By.xpath("//li[@id='item-4']/span[text()='Modal Dialogs']");

    public ModalDialogsPage clickModalDialogsMenu () {
        scrollToElementJS(modalDialogsMenuItem);
        click(modalDialogsMenuItem);
        return new ModalDialogsPage();
    }
}
