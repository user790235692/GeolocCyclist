/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geoloc.models;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import javax.annotation.PostConstruct;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;

/**
 *
 * @author Lucas
 */
@Singleton
@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER)
public class MongoClientProvider {
     private MongoClient mongoClient = null;
    
    @Lock(LockType.READ)
    public MongoClient getMongoClient(){
        return mongoClient;
    }
    @PostConstruct
    public void init(){
        MongoClientURI uri = new MongoClientURI("mongodb://root:root@mongo:27017/");
        mongoClient = new MongoClient(uri);
        System.out.println("Je suis connecté");
    }
}
