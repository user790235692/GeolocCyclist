/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geoloc.selenium;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 *
 * @author Lucas
 */
public class Helper {

    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
    public static String remote_url_firefox = "http://localhost:4444/wd/hub";

    public void Setup() throws MalformedURLException {
        FirefoxOptions options = new FirefoxOptions();
        
        driver.set(new RemoteWebDriver(new URL(remote_url_firefox), options));
    }

    public WebDriver GetDriver() {
        return driver.get();
    }

    public void TearDown() {
        GetDriver().quit();
    }
}
