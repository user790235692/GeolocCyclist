/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.geoloc.models;

import com.geoloc.beans.Cyclist;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



/**
 *
 * @author Lucas
 */

@Stateless
public class CyclistModelSql {
    
    @PersistenceContext
    private EntityManager em;
    
    public CyclistModelSql(){
    }
    
    public void create(Cyclist cyclist) {
        em.persist(cyclist);
    }
    
    
}
