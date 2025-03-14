package com.demoqa.pages.elements;

import org.openqa.selenium.By;

public class LinksPage extends ElementsPage {

    private By badRequestLink = By.id("bad-request");
    private By linkResponse = By.id("linkResponse");

    public void clickBadRequestLink() {
        click(badRequestLink);
    }

    public String getRequestResponse() {
        delay(2000);
        return find(linkResponse).getText();
    }
}
