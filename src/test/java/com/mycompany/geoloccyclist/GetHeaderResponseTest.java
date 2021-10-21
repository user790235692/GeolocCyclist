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
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 *
 * @author Lucas
 */
public class GetHeaderResponseTest {

    // https://stackoverflow.com/questions/2893819/accept-servers-self-signed-ssl-certificate-in-java-client
    // Lien du stack overflow pour contourner les certificats SSL
    @BeforeTest
    public void setUp() throws NoSuchAlgorithmException, KeyManagementException{
        TrustManager[] trustAllCerts = new TrustManager[] { 
            new X509TrustManager() {     
                public java.security.cert.X509Certificate[] getAcceptedIssuers() { 
                    return new X509Certificate[0];
                } 
                public void checkClientTrusted( 
                    java.security.cert.X509Certificate[] certs, String authType) {
                    } 
                public void checkServerTrusted( 
                    java.security.cert.X509Certificate[] certs, String authType) {
                }
            } 
        }; 

        SSLContext sc = SSLContext.getInstance("SSL"); 
        sc.init(null, trustAllCerts, new java.security.SecureRandom()); 
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
    }

    @Test
    public void Get200CodeIndex() throws IOException {

            URL index = new URL("https://localhost:8181/sample/");
            HttpURLConnection connection = (HttpURLConnection)index.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int code = connection.getResponseCode();
            System.out.println(code);
            assertEquals(200, code);
        }


    @Test
    public void Get200CodeList() throws IOException {

            URL index = new URL("https://localhost:8181/sample/listCyclist.jsf");
            HttpURLConnection connection = (HttpURLConnection)index.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int code = connection.getResponseCode();
            System.out.println(code);
            assertEquals(200, code);

        }

}
