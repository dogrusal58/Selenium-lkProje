package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_GoogleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/zbook/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("https://google.com");

        WebElement aramaKutusu =driver.findElement(By.name("q"));
        aramaKutusu.sendKeys("city bike");
        aramaKutusu.submit();//submit sadece giriş yapılabilen kutularda enter görevi görüyor

        WebElement sonucSayisi = driver.findElement(By.id("result-stats"));
        sonucSayisi.getText();
        System.out.println(sonucSayisi.getText());//arama sonuç sayısını yazdırdım

        WebElement alisverisLinki = driver.findElement(By.partialLinkText("Alışveriş"));
        alisverisLinki.click();

    }
}
