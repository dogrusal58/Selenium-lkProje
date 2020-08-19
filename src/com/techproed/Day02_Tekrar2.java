package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_Tekrar2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/zbook/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver tekrar2 = new ChromeDriver();
        tekrar2.manage().window().maximize();

        tekrar2.get("https://www.epey.com");
        tekrar2.get("https://www.sahibinden.com");
        tekrar2.get("https://www.hepsiburada.com");

        tekrar2.navigate().back();
        tekrar2.navigate().back();
        tekrar2.navigate().forward();
        tekrar2.navigate().refresh();
        tekrar2.quit();

        String sUrl = tekrar2.getCurrentUrl();
        String sTitle = tekrar2.getTitle();

        System.out.println("site linki : " + sUrl);
        System.out.println("site basliği : " + sTitle);

        //if(sTitle.contains("Ev Kiralama")){
          //  System.out.println("var");
        //}else{
          //  System.out.println("yok");
        //}
        tekrar2.quit();
    }
}
