package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/zbook/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://amazon.com");
        String amazonTitle =driver.getTitle();
        if(amazonTitle.contains("Books")){
            System.out.println("Books kelimesini içeriyor");
        }else{
            System.out.println("Books kelimesini içermiyor");
        }
driver.quit();

    }
}
