package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/zbook/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http:a.testaddressbook.com/");

        WebElement signInLink = driver.findElement(By.xpath("//a[@id='sign-in']"));
        signInLink.click();

        WebElement emailKutusu = driver.findElement(By.xpath("//input[@id='session_email']"));
        emailKutusu.sendKeys("testtechproed@gmail.com");

        WebElement sifreKutusu =driver.findElement(By.xpath("//input[@id='session_password']"));
        sifreKutusu.sendKeys("Test1234!");

        //sifreKutusu.submit(); bu şekilde de entera basmış oluruz.

        WebElement signInButton = driver.findElement(By.xpath("//input[@type='submit']"));
        signInButton.click();



    }
}
