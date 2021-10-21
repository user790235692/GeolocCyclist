/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.geoloccyclist;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;

/**
 *
 * @author Lucas
 */
public class GetHeaderResponse {
    @Test
    public void Get200Code() throws IOException {
        try{
            URL index = new URL("https://localhost:8181/sample/");
            HttpURLConnection connection = (HttpURLConnection)index.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int code = connection.getResponseCode();
            System.out.print(code);
            assertEquals("200", code);
        }
        catch(IOException e){
            System.out.println(e);
        }

    }
}
