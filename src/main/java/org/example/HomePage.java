package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class HomePage {
    WebDriver driver;
    By heading = By.xpath(
            "//table//tr[@class='heading3']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHomePageDashboardUserName(){
        return driver.findElement(heading)
                .getText();
    }

}
