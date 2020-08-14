package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationOdev {
    public static void main(String[] args) {
        //önce google,sonra youtube a didip,google.com a back methodu ile geri dönünüz
        //youtube.com a ileri gidip,youtube u yenileyin

        System.setProperty("webdriver.chrome.driver", "C:/Users/zbook/Documents/selenium dependencies/drivers/chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://google.com");
        webDriver.navigate().to("https://youtube.com");
        webDriver.navigate().back();
        webDriver.navigate().forward();
        webDriver.navigate().refresh();
        webDriver.quit();


    }
}
