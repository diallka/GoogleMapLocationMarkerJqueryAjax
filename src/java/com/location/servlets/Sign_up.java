/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.location.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.location.entities.Utilisateur;
import com.location.services.UserService;

/**
 *
 * @author admin
 */
@WebServlet(name = "Sign_up", urlPatterns = {"/sign_up"})
public class Sign_up extends HttpServlet {

    @Override
    //Méthode doPost envoie des données
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String name = request.getParameter("name");
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        Utilisateur util = new Utilisateur();
        util.setName(name);
        util.setLogin(login);
        util.setPassword(password);

        //util.getEtatUtil(Utilisateur.EtatUtil.VALIDE);
        //Vérifier si utilisateur existe en BDD
        new UserService().inscription(util);
//
//        //Envoi email
//        String mailDest = request.getParameter(email);
//        String titre = "Titre";
//        String msg = "Votre inscription sera validé sous 24h";
//
//        new UtilisateurService().envoyerMail(mailDest, titre, msg);
        //Rédirection vers 
        response.sendRedirect("sign_in");

    }

    @Override
    //Méthode doGet recupère des données
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //Renvoyer vers  la jsp "form.jso"
        request.getRequestDispatcher("sign_up.jsp").forward(request, response);
    }

}
