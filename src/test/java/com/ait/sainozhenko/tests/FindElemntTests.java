package com.ait.sainozhenko.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindElemntTests {
    WebDriver driver;

@BeforeMethod
public void setUp(){
    driver = new ChromeDriver();
    driver.get("https://ilcarro.web.app");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@Test
    public void findElementByCssTest(){
    //id -> css(#)
    //driver.findElement.(By.id("city");
    driver.findElement(By.cssSelector("#city"));

    driver.findElement(By.cssSelector(".header"));

    //attribute -> css([])
    driver.findElement(By.cssSelector("[type='submit']"));

    //contains -> *
    driver.findElement(By.cssSelector("[href*='car'"));
    //start with -> ^
    driver.findElement(By.cssSelector("[href^='/let']"));

    //end on -> $
    driver.findElement(By.cssSelector("[href$='work']"));
    }
    //XPATH  //*[@atr='name']
    @Test
    public void findElementByXpathTest(){
        //id -> xpath //*[@atr= 'value']
        //driver.findElement.(By.id("city");
        driver.findElement(By.xpath("//*[@id='city']"));

        //class -> xpath //*[@class ='value']
        //driver.findElement(By.className("header"));
        driver.findElement(By.xpath("//*[@class='header']"));

        //contains, end on, start -> //*[contains(., 'text')]
         driver.findElement(By.xpath("//*[contains(.,'Type your data and hit Yalla!')]"));
    }
}