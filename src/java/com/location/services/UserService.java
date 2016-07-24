/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.location.services;

import java.util.List;
import com.location.dao.UserDAO;
import com.location.entities.Utilisateur;

/**
 *
 * @author admin
 */
public class UserService {

    //On recherche un utilisateur existant pour le connecter
    public Utilisateur rechercheParLoginEtMdp(String login, String password) {
   
        return new UserDAO().rechercheParLoginEtMdp(login, password);
    }

    //On gere la verifiaction et l'inscription
    public void inscription(Utilisateur util) {
        UserDAO dao = new UserDAO();
        //On verifie le nouveau login, s'il existe on renvoit une erreur,
        List<Utilisateur> listeUtilAvecCeLogin = dao.rechercheParLoginEtMdp(util.getLogin());
        if(listeUtilAvecCeLogin.size() > 0)
            throw new RuntimeException("Ce login existe dejà");
        
        // s'il n'existe pas on le crée
        dao.creerUtilisateur(util);
    }
    
    
}
