/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geoloc.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.bson.types.ObjectId;

/**
 *
 * @author Lucas
 */
@RequestScoped
@Named
public class Cyclist {
    private ObjectId id;
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private boolean onLine;
    private String picture;
    
    private String latitude;
    private String longitude;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isOnLine() {
        return onLine;
    }

    public void setOnLine(boolean onLine) {
        this.onLine = onLine;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    

    public Cyclist(ObjectId id, String email, String firstName, String lastName, String password, boolean onLine, String picture, String latitude, String longitude) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.onLine = onLine;
        this.picture = picture;
        this.latitude = latitude;
        this.longitude = longitude;
        
    }
    
    public Cyclist(){
        
    }
}
