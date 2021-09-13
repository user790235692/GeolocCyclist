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

    public void submitButton() {
        cyclistModel.create(cyclist);
    }

    public List<Cyclist> showCyclist() {
        listCyclist = cyclistModel.read();
        return listCyclist;
    }

    public void delete(ObjectId id) {
        cyclistModel.delete(id);
        System.out.println(id);
    }
}
