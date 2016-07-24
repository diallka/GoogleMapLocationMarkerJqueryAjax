/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.location.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.location.entities.Utilisateur;

/**
 *
 * @author admin
 */
public class UserDAO {

    
     //Rechercher utilisateur existant par login et mdp et on le connecte
    public Utilisateur rechercheParLoginEtMdp(String login, String password) {
       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
       Query query = em.createQuery("SELECT u FROM Utilisateur u WHERE u.login=:monLogin AND u.password=:monMdp");
       query.setParameter("monLogin", login);
       query.setParameter("monMdp", password);
       return (Utilisateur) 
               query.getSingleResult();
    }

    //Rechercher si un utilisateur a deja ce login si oui on renvoie une exception specifiée dans le Service
    public List<Utilisateur> rechercheParLoginEtMdp(String login) {
       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
       return em.createQuery("SELECT u FROM Utilisateur u WHERE u.login=:newLogin").setParameter("newLogin", login).getResultList();
    }
    
    //On crée un Utilisateur s'il n'existe pas
    public void creerUtilisateur(Utilisateur util){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        em.getTransaction().begin();
        em.persist(util);
        em.getTransaction().commit();
    }
}
