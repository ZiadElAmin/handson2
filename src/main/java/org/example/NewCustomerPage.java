package org.example;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCustomerPage {
    WebDriver driver;

//Ziad Amin Abdelmoneim 2022170899
    By customerName = By.name("name");
    By genderMale   = By.xpath("//input[@value='m']");
    By dateOfBirth  = By.name("dob");
    By address      = By.name("addr");
    By city         = By.name("city");
    By State         = By.name("state");
    By pin          = By.name("pinno");
    By mobileNumber = By.name("telephoneno");
    By email        = By.name("emailid");
    By password     = By.name("password");
    By submitBtn    = By.name("sub");

    public NewCustomerPage(WebDriver driver) {
        this.driver = driver;
    }


    public void fillCustomerForm(String name, String dob, String addr, String cityName, String state, String pinCode, String mobile, String emailId, String pwd) {
        driver.findElement(customerName).sendKeys(name);
        driver.findElement(genderMale).click();
        WebElement dobElement = driver.findElement(dateOfBirth);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('type', 'text');", dobElement);
        dobElement.clear();
        dobElement.sendKeys(dob);
        driver.findElement(address).sendKeys(addr);
        driver.findElement(city).sendKeys(cityName);
        driver.findElement(State).sendKeys(state);
        driver.findElement(pin).sendKeys(pinCode);
        driver.findElement(mobileNumber).sendKeys(mobile);
        driver.findElement(email).sendKeys(emailId);
        driver.findElement(password).sendKeys(pwd);
    }

    public void clickSubmit() {
        driver.findElement(submitBtn).click();
    }
}