package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_Tekrar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/zbook/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver tekrar = new ChromeDriver();

        tekrar.manage().window().maximize();

        tekrar.get("https://dailymotion.com");
        tekrar.get("https://youtube.com");
        tekrar.get("https://amazon.com");
        tekrar.navigate().back();
        tekrar.navigate().back();
        tekrar.navigate().forward();
        tekrar.navigate().refresh();

        
        String yTitle = tekrar.getTitle();
        String yUrl = tekrar.getCurrentUrl();
        System.out.println("baslik : " + yTitle);
        System.out.println("web adresi : " + yUrl);

        if(yTitle.contains("video")){
            System.out.println("içerik bulundu : " + yTitle);
        }else{
            System.out.println("içerik bulunamadı : " + yTitle);
        }
        tekrar.quit();

    }
}
