package com.ait.sainozhenko.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstSearchElementHw {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void findElementByCssTest(){
        driver.findElement(By.cssSelector(".header"));
        driver.findElement(By.cssSelector("[type='text/javascript']"));
        driver.findElement(By.cssSelector(".master-wrapper-page"));
        driver.findElement(By.cssSelector("#dialog-notifications-error"));
        driver.findElement(By.cssSelector("[title='Close']"));
    }
    @Test
    public void findElementByXpathTest(){
        driver.findElement(By.xpath("//*[@id='dialog-notifications-success']"));
        driver.findElement(By.xpath("//*[@title='Notification']"));
        driver.findElement(By.xpath("//*[@style='display:none;']"));
        driver.findElement(By.xpath("//*[@type='text/javascript']"));
        driver.findElement(By.xpath("//*[contains(.,'Welcome to our store')]"));


    }
}
