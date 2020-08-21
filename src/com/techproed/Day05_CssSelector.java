package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_CssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/zbook/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http:a.testaddressbook.com/");
        //cssSelector kullanırken,class value kullanıyorsak .value
        //                       ,id value kullanıyorsak #value
        WebElement emailKutusu = driver.findElement(By.cssSelector(".form-control"));
        WebElement emailKutu = driver.findElement(By.cssSelector("#session_email"));






    }
}
