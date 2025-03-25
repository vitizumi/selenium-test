package com.demoqa.pages.alerts;

import java.util.Set;

import org.openqa.selenium.By;

import static utilities.SwitchToUtility.*;

public class BrowserWindowsPage extends AlertsPage {

    private By newWindowButton = By.id("windowButton");

    public void clickNewWindowButton () {
        click(newWindowButton);
    }

    public void switchToNewWindow () {
        //Get current window handle
        String currentHandle = driver.getWindowHandle();
        System.out.println("Main Window ID: " + currentHandle + "\n");

        //Get all window handles
        Set<String> allHandles = driver.getWindowHandles();
        System.out.println("# of Open Windows : " + allHandles.size());
        for (String handle : allHandles) {
            if (currentHandle.equals(handle)) {
                System.out.println("1st Window ID: " + handle);
            } else {
                switchToWindow(handle);
                System.out.println("2nd Window ID: " + handle);
            }
        }
    }
}
