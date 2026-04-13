package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePageWithPageFactory {
    @FindBy(xpath =
            "//table//tr[@class='heading3']")
    WebElement homePageUserName;

    public HomePageWithPageFactory(WebDriver d) {
        PageFactory.initElements(d, this);
    }
    public String getHomePageDashboardUserName(){
        return homePageUserName.getText();
    }

}
