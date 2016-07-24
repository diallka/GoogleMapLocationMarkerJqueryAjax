/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.location.dao;

import com.location.entities.User;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author admin
 */
public class UserDAO {

    
    //On crée un Utilisateur s'il n'existe pas
    public void signUpUser(User user){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
    }
    
}
