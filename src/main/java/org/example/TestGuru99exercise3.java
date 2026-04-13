package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
public class TestGuru99exercise3 {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.guru99.com/V4/");
    }

    @Test
    public void test_Create_New_Customer_Flow() {

        LoginPage login = new LoginPage(driver);
        login.setUserName("mngr658766");
        login.setPassword("gUdaqAs");
        login.clickLogin();


        driver.findElement(By.linkText("New Customer")).click();


        NewCustomerPage newCustomer = new NewCustomerPage(driver);
        newCustomer.fillCustomerForm(
                "Ziad Amin",
                "03/11/2004",
                "22 jump street",
                "Maadi",
                "Cairo",
                "1234567",
                "51452563",
                "jfyrjhgghhgedj@example.com",
                "1234567"
        );
        newCustomer.clickSubmit();


        CustomerConfirmationPage confirmation = new CustomerConfirmationPage(driver);
        String actualMessage = confirmation.getConfirmationMessage();


    }
}
