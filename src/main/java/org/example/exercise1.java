package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class exercise1 {
    WebDriver driver;
    @BeforeTest
    public void openWebSite(){
        driver= new FirefoxDriver();
        System.out.println("opening the websitee");
        driver.get("https://www.noon.com/egypt-en/");
    }
    @Test(priority = 1)
    public void signUp(){
        System.out.println("test priority 1: sign up");
    }
    @Test(priority = 2)
    public void logIn(){
        System.out.println("Test priority 2: Login");
    }
    @Test(priority = 3)
    public void addtoCart(){
        System.out.println("test priority 3: add to cart");
    }
    @AfterTest
    public void logOut(){
        System.out.println("After test log out");
        driver.quit();
    }
}
