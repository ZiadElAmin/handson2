package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;
import org.openqa.selenium.Alert;



public class TestGuru99WithPageFactory {
    WebDriver driver = new ChromeDriver();
    LoginPageWithPageFactory  objLogin =
            new LoginPageWithPageFactory(driver);
    HomePageWithPageFactory   objHome  =
            new HomePageWithPageFactory(driver);

    @Test(priority=0)
   public void testFundTransfer(){
        driver.get("http://demo.guru99.com/V4/");
        LoginPageWithPageFactory  objLogin =
                new LoginPageWithPageFactory(driver);
        FundTranferPage fund=
                new FundTranferPage(driver);
        objLogin.setUserName("mngr658766");
        objLogin.setPassword("gUdaqAs");
        objLogin.clickLogin();

        fund.goToFundTransfer();

        fund.setPayer("124523456");
        fund.setPayee("12345526");
        fund.setAmount("1000");
        fund.setDescription("test");
        fund.clickSubmit();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        String message = alert.getText();
        alert.accept();

        Assert.assertTrue(message.contains("does not exist"));
    }

}
