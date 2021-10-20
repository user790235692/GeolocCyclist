/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.geoloccyclist;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

/**
 *
 * @author Lucas
 */
public class AddUserTest {

    WebDriver driver;

    @BeforeTest
    public void Setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lucas\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    public void login() {
        String login_url = "https://opensource-demo.orangehrmlive.com/";
        driver.get(login_url);

        driver.manage().window().maximize();
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        System.out.println(driver.getTitle());
    }

    @Test
    public void dashboard() {

        driver.findElement(By.id("menu_dashboard_index")).click();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
