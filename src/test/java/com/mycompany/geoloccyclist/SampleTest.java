package com.mycompany.geoloccyclist;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.geoloc.selenium.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 *
 * @author Lucas
 */
public class SampleTest extends Helper {

    WebDriver webDriver = GetDriver();

    @BeforeTest
    public void Setup() {
        webDriver.get("https://localhost:8181/sample/");
        webDriver.manage().window().setSize(new Dimension(776, 464));

    }

    @Test
    public void InsertUser() {

        webDriver.findElement(By.id("j_idt5:j_idt9")).click();
        webDriver.findElement(By.id("j_idt5:j_idt9")).sendKeys("Lucas");
        webDriver.findElement(By.id("j_idt5:j_idt13")).sendKeys("legeek568@gmail.com");
        webDriver.findElement(By.id("j_idt5:j_idt11")).click();
        webDriver.findElement(By.id("j_idt5:j_idt11")).sendKeys("Lucas Antunes");
        webDriver.findElement(By.id("j_idt5:j_idt15")).click();
        webDriver.findElement(By.id("j_idt5:j_idt15")).sendKeys("sdsdsd");
        webDriver.findElement(By.id("j_idt5:j_idt17")).click();
        webDriver.findElement(By.id("j_idt5:j_idt17")).sendKeys("sdsds");
        webDriver.findElement(By.id("j_idt5:j_idt19")).click();
        webDriver.findElement(By.id("j_idt5:j_idt19")).sendKeys("sdsds");
        webDriver.findElement(By.cssSelector(".ui-button-text")).click();
    }

    @AfterTest
    public void tearDown() {
        webDriver.quit();
    }

}
