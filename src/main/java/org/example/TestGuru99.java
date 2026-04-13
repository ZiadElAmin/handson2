package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TestGuru99 {
    WebDriver driver = new FirefoxDriver();
    LoginPage objLogin = new LoginPage(driver);
    HomePage  objHome  = new HomePage(driver);

    @BeforeMethod
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test(priority=0)
    public void test_Home_Page_Appear_Correct() throws Exception {
        driver.get("http://demo.guru99.com/V4/");
        Assert.assertTrue(objLogin.getBankTitle().toLowerCase().contains("guru99 bank"));
        objLogin.setUserName("mngr658766");
        objLogin.setPassword("gUdaqAs");
        objLogin.clickLogin();
        Assert.assertTrue(objHome.getHomePageDashboardUserName().toLowerCase().contains("mngr658766"));
    }

}
