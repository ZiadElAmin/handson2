package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPageFactory {
    WebDriver driver;

    @FindBy(name = "uid")
    WebElement userNameElement;

    @FindBy(name = "password")
    WebElement passwordElement;

    @FindBy(name = "btnLogin")
    WebElement loginButtonElement;

    @FindBy(className = "barone")
    WebElement bankTitleElement;

    public LoginPageWithPageFactory(WebDriver driver) {
        this.driver = driver;

        AjaxElementLocatorFactory factory =
                new AjaxElementLocatorFactory(driver, 10);
        PageFactory.initElements(driver, this);

    }
    public void   setUserName(String s) { userNameElement.sendKeys(s); }
    public void   setPassword(String s) { passwordElement.sendKeys(s); }
    public void   clickLogin()          { loginButtonElement.click(); }
    public String getBankTitle()        { return bankTitleElement.getText(); }

}
