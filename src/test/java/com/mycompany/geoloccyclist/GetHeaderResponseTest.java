/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.geoloccyclist;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;

import org.testng.annotations.Test;

/**
 *
 * @author Lucas
 */
public class GetHeaderResponseTest {
    @Test
    public void Get200CodeIndex() throws IOException {
        try{
            URL index = new URL("https://localhost:8181/sample/");
            HttpURLConnection connection = (HttpURLConnection)index.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int code = connection.getResponseCode();
            System.out.println(code);
            assertEquals("200", code);
        }
        catch(IOException e){
            System.out.println(e);
        }

    }

    @Test
    public void Get200CodeList() throws IOException {
        try{
            URL index = new URL("https://localhost:8181/sample/listCyclist.jsf");
            HttpURLConnection connection = (HttpURLConnection)index.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int code = connection.getResponseCode();
            System.out.println(200);
            assertEquals("200", code);
        }
        catch(IOException e){
            System.out.println(e);
        }

    }
}
