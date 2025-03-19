package com.demoqa.pages.alerts;

import org.openqa.selenium.By;

public class ModalDialogsPage extends AlertsPage {
    
    private By smallModalButton = By.id("showSmallModal");
    private By smallModalText = By.xpath("//div[contains(text(), 'small modal')]");
    private By closeSmallModalButton = By.id("closeSmallModal");

    public void openSmallModal () {
        click(smallModalButton);
    }

    public String getSmallModalText () {
        delay(2000);
        return find(smallModalText).getText();
    }

    public void closeSmallModal () {
        click(closeSmallModalButton);
    }
}
