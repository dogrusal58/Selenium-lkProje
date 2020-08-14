package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/zbook/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://www.google.com");
        webDriver.navigate().to("https://amazon.com");
        String sayfaTitle = webDriver.getTitle();//bulunduğumuz sayfanın başlığını alır
        String sayfaUrl = webDriver.getCurrentUrl();//bulunduğumuz sayfanın adresini alır

        webDriver.quit();




    }
}
