package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import java.time.Duration;
public class FundTranferPage {
    WebDriver driver;
    @FindBy(name = "payersaccount")
    WebElement payer;

    @FindBy(name = "payeeaccount")
    WebElement payee;
    @FindBy(name = "ammount")
    WebElement amount;
    @FindBy(name = "desc")
    WebElement description;
    @FindBy(name = "AccSubmit")
    WebElement submit;

    public FundTranferPage(WebDriver driver){
        this.driver=driver;
        AjaxElementLocatorFactory factory =
                new AjaxElementLocatorFactory(driver,10);
        PageFactory.initElements(factory, this);
    }
    public void goToFundTransfer(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement fundlink = wait.until(
            ExpectedConditions.presenceOfElementLocated(By.linkText("Fund Transfer"))
        );
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", fundlink);

        try { Thread.sleep(1000); } catch (InterruptedException ignored){}
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", fundlink);
    }
    public void setPayer(String payerr) {payer.sendKeys(payerr); }
    public void setPayee(String payeee) {payee.sendKeys(payeee); }

    public void setAmount(String amn) {
        amount.sendKeys(amn);
    }

    public void setDescription(String d) {
        description.sendKeys(d);
    }
    public void clickSubmit(){submit.click();}
}
