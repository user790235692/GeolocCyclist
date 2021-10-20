package com.mycompany.geoloccyclist;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 *
 * @author Lucas
 */
public class SampleTest {

    WebDriver driver;
    public String  RemoteUrl = "http://localhost:4444/wd/hub";

    @BeforeTest
    public void Setup() {
        
        driver = new ChromeDriver();
        ChromeOptions handlingSSL = new ChromeOptions();
        handlingSSL.setAcceptInsecureCerts(true);
        driver = new ChromeDriver(handlingSSL);
        //driver.set(new RemoteWebDriver(new URL(RemoteUrl), handlingSSL));
    }

    @Test
    public void InsertUser() {
        driver.get("https://localhost:8181/sample/");
        driver.manage().window().setSize(new Dimension(776, 464));
        driver.findElement(By.id("j_idt5:j_idt9")).click();
        driver.findElement(By.id("j_idt5:j_idt9")).sendKeys("Lucas");
        driver.findElement(By.id("j_idt5:j_idt13")).sendKeys("legeek568@gmail.com");
        driver.findElement(By.id("j_idt5:j_idt11")).click();
        driver.findElement(By.id("j_idt5:j_idt11")).sendKeys("Lucas Antunes");
        driver.findElement(By.id("j_idt5:j_idt15")).click();
        driver.findElement(By.id("j_idt5:j_idt15")).sendKeys("sdsdsd");
        driver.findElement(By.id("j_idt5:j_idt17")).click();
        driver.findElement(By.id("j_idt5:j_idt17")).sendKeys("sdsds");
        driver.findElement(By.id("j_idt5:j_idt19")).click();
        driver.findElement(By.id("j_idt5:j_idt19")).sendKeys("sdsds");
        driver.findElement(By.cssSelector(".ui-button-text")).click();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
