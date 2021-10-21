package com.mycompany.geoloccyclist;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import org.openqa.selenium.remote.RemoteWebDriver;
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
public class SampleTest {

    @Test
    public void testApp() throws MalformedURLException, InterruptedException {

        FirefoxOptions firefoxOptions = new FirefoxOptions();

        firefoxOptions.setAcceptInsecureCerts(true);
        
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), firefoxOptions);
        driver.get("https://192.168.56.1:8181/sample/");
        Thread.sleep(500);
        driver.quit();
    }
}
