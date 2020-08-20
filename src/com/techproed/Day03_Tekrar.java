package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day03_Tekrar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/zbook/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver tekrar = new ChromeDriver();


        tekrar.manage().window().maximize();
        tekrar.get("https://youtube.com");

        WebElement search = tekrar.findElement(By.name("search_query"));
        search.sendKeys("geometri dersleri");

        WebElement searchbox = tekrar.findElement(By.id("search-icon-legacy"));
        searchbox.click();





    }
}
