package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day03_LocatorsGiris {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/zbook/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http:a.testaddressbook.com/");

        //ilk web elementimizi buluyoruz
       //web sayfsındaki tüm elemanları web element olarak tanımlarız.WebElement bizim veri tipimiz

        WebElement signInLink = driver.findElement(By.id("sign-in"));
        signInLink.click();

        WebElement eMailKutusu =driver.findElement(By.id("session_email"));
        eMailKutusu.sendKeys("testtechproed@gmail.com");

        WebElement sifreKutusu =driver.findElement(By.id("session_password"));
        sifreKutusu.sendKeys("Test1234!");

        WebElement signInButonu = driver.findElement(By.name("commit"));
        signInButonu.click();

        String stitle =driver.getTitle();
        if(stitle.equals("Address Book")){
            System.out.println("giris basarili");
        }else{
            System.out.println("giris basarili degil");
        }
    }
}
