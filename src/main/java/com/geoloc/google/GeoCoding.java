/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geoloc.google;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;

import com.google.maps.model.GeocodingResult;
import com.google.maps.model.LatLng;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


/**
 *
 * @author Lucas
 */

@Named
@RequestScoped
public class GeoCoding {

    public void getFormatedAdress() throws Exception {
        
        String API_GOOGLE = System.getenv("API_GOOGLE");

        try {
            GeoApiContext context = new GeoApiContext.Builder()
                    .apiKey(API_GOOGLE)
                    .build();
            GeocodingResult[] results = GeocodingApi.geocode(context,
                    "21 rue des capucins, FR 39000").await();

            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            System.out.println(gson.toJson(results[0].geometry));
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
