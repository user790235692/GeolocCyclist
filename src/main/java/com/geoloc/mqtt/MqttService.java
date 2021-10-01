/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geoloc.mqtt;

import com.geoloc.beans.Cyclist;
import com.geoloc.models.CyclistModel;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.enterprise.context.ApplicationScoped;
import org.bson.types.ObjectId;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

/**
 *
 * @author Lucas
 */
@Startup
@Singleton
@ApplicationScoped
public class MqttService implements MqttCallback {
    
    @EJB
    private CyclistModel cyclistModel;
    MqttClient client;
    
    public MqttService(){}
    @PostConstruct
    public void init() {
        try {
            System.out.println("DANS INIT MQTT SERVICE");

            client = new MqttClient("tcp://localhost:1883", MqttClient.generateClientId(), new MemoryPersistence());

            MqttConnectOptions connOpts = new MqttConnectOptions();
            connOpts.setCleanSession(true);
            connOpts.setConnectionTimeout(300);
            connOpts.setKeepAliveInterval(30);
            connOpts.setMqttVersion(MqttConnectOptions.MQTT_VERSION_3_1_1);
            client.connect(connOpts);

            //je m'abonne à ce topic 
            client.subscribe("topic/cyclist");

            //j'écoute ce topic dans la methode de la classe messageArrived() 
            client.setCallback(this);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    @Override
    public void messageArrived(String s, MqttMessage mqttMessage) throws Exception {
        System.out.println("Message reçu:\n\t" + new String(mqttMessage.getPayload()));
        
        String reception = new String(mqttMessage.getPayload());
        if(!reception.equalsIgnoreCase("")){
            
            String[] exploded = reception.split("#");
            String oid = exploded[0];
            String latitude = exploded[1];
            String longitude = exploded[2];
            
            Cyclist c = cyclistModel.find(new ObjectId(oid));
            
            c.setLatitude(latitude);
            c.setLongitude(longitude);
            
            
        }
    }

    @Override
    public void connectionLost(Throwable thrwbl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deliveryComplete(IMqttDeliveryToken imdt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
