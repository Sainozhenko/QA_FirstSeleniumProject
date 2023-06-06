package com.ait.sainozhenko.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class FirstSeleniumTest {
    WebDriver driver;
    //before - setUp
    @BeforeMethod
    public void setUp(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("remote-allow-origins=*");
        driver = new ChromeDriver();

//        driver.get("https://www.google.com/");
        driver.navigate().to("https://telranedu.web.app/login"); // with save history

        //maximize browser window
        driver.manage().window().maximize();
    }

    //tests
    @Test
    public void openSite(){
        System.out.println("Site opened!!!");
        //find element by tag
        WebElement h1 = driver.findElement(By.tagName("h1"));
        System.out.println(h1.getText());

        //find list of eleemtns
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());

        //find element by class name
        WebElement element1 = driver.findElement(By.className("navbar-component_nav__1X_4m"));
        System.out.println(element1.getText());


        //find element by name
        WebElement element2 = driver.findElement(By.name("email"));
        System.out.println(element2.getText());
    }

    //after - tearDown
    @AfterMethod
    public void tearDown(){
        driver.quit(); // all tabs & close browser
//        driver.close(); //only one tab close(if 1 tab close all:)
    }
}
