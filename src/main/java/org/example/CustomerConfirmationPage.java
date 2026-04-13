package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerConfirmationPage {
    WebDriver driver;


    By successMessage = By.xpath("//p[@class='heading3']");

    public CustomerConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getConfirmationMessage() {
        return driver.findElement(successMessage).getText();
    }
}