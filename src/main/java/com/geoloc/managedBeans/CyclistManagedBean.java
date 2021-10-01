/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geoloc.managedBeans;

import com.geoloc.beans.Cyclist;
import com.geoloc.models.CyclistModel;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.bson.types.ObjectId;

/**
 *
 * @author Lucas
 */
@Named
@RequestScoped

public class CyclistManagedBean {

    private Cyclist cyclist = new Cyclist();
    private List<Cyclist> listCyclist;
    @EJB
    private CyclistModel cyclistModel;

    public Cyclist getCyclist() {
        return cyclist;
    }

    public void setCyclist(Cyclist cyclist) {
        this.cyclist = cyclist;
    }

    public String submitButton() {
        FacesMessage faces = new FacesMessage(FacesMessage.SEVERITY_INFO, "User is created", null);
        FacesContext.getCurrentInstance().addMessage("succes_create", faces);
        if(cyclist.getId() != null){
            cyclistModel.update(cyclist);
        }else{
            cyclistModel.create(cyclist);
        }
        
        
        cyclist = new Cyclist();
        
        return "listCyclist";
    }

    public List<Cyclist> showCyclist() {
        listCyclist = cyclistModel.read();
        return listCyclist;
    }

    public void delete(Cyclist cyclist) {
        cyclistModel.delete(cyclist);

    }
    
    public String update(Cyclist cyclist){
        this.cyclist = cyclist;
        return "index";
    }
    
}
