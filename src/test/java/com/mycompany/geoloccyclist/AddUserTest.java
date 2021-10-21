package com.mycompany.geoloccyclist;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lucas
 */
public class AddUserTest {

    WebDriver driver;
    @BeforeTest
    
    public void setUp() throws MalformedURLException{
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setAcceptInsecureCerts(true);
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), firefoxOptions);
        
    }


    @Test
    public void testApp() throws InterruptedException {

        
        driver.get("https://payara:8181/sample");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("j_idt5:j_idt9")).click();
        driver.findElement(By.id("j_idt5:j_idt9")).sendKeys("Remi");
        driver.findElement(By.id("j_idt5:j_idt11")).click();
        driver.findElement(By.id("j_idt5:j_idt11")).sendKeys("Vulliez");
        driver.findElement(By.id("j_idt5:j_idt13")).click();
        driver.findElement(By.id("j_idt5:j_idt13")).sendKeys("chocolaterie@fraise.fr");
        driver.findElement(By.id("j_idt5:j_idt15")).click();
        driver.findElement(By.id("j_idt5:j_idt15")).sendKeys("FlamantRose36");
        driver.findElement(By.id("j_idt5:j_idt17")).click();
        driver.findElement(By.id("j_idt5:j_idt17")).sendKeys("46.19308371013082");
        driver.findElement(By.id("j_idt5:j_idt19")).click();
        driver.findElement(By.id("j_idt5:j_idt19")).sendKeys("6.2468465014616354");
        driver.findElement(By.cssSelector(".ui-button-text")).click();
        System.out.println(driver.getPageSource());
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
