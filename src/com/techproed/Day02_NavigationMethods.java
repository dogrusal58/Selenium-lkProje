package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/zbook/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver webDriver =new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://google.com" );
        webDriver.get("https://amazon.com");//get ile aynı işlevi yapıyor.get daha çok kullanılır

        webDriver.navigate().back();//bu komut bi önceki sayfaya geri döndürüyor
        webDriver.navigate().forward();//geri geldiğimiz sayfaya gitmemizi sağlıyor.ileri butonu
        webDriver.navigate().refresh();//sayfayı yeniler
    }
}
