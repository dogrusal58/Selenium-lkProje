package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//youtube a git
public class Day02_TitleUrlTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/zbook/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://youtube.com");
        driver.manage().window().maximize();
        String youtubeTitle = driver.getTitle();

        if(youtubeTitle.contains("video")){
            System.out.println("video kelimesini içeriyor");
        }else{
            System.out.println("video kelimesini içermiyor");
        }
driver.quit();

    }
}
