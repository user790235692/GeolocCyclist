package com.mycompany.geoloccyclist;

import java.net.MalformedURLException;
import java.net.URL;

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

        driver.get("https://192.168.56.1:8181/sample/");
        driver.findElement(By.id("j_idt5:firstName")).click();
        driver.findElement(By.id("j_idt5:firstName")).sendKeys("Rémi");
        driver.findElement(By.id("j_idt5:lastName")).sendKeys("Vulliez");
        driver.findElement(By.id("j_idt5:email")).sendKeys("chocolatrie@fraise.fr");
        driver.findElement(By.id("j_idt5:password")).click();
        driver.findElement(By.id("j_idt5:password")).sendKeys("FlamantRose36");
        driver.findElement(By.id("j_idt5:lat")).click();
        driver.findElement(By.id("j_idt5:lat")).sendKeys("46.19308371013082");
        driver.findElement(By.id("j_idt5:long")).click();
        driver.findElement(By.id("j_idt5:long")).sendKeys("6.2468465014616354");
        driver.findElement(By.cssSelector(".ui-button-text")).click();
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
