/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.location.servlets;

import com.location.entities.Utilisateur;
import com.location.services.UserService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author admin
 */
@WebServlet(name = "Sign_in", urlPatterns = {"/sign_in"})
public class Sign_in extends HttpServlet {

    @Override
    //Méthode doPost envoie des données
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //Récuperer params formulaire
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        //Récuperer l'utilisateur correspondant en BDD
        //new UtilisateurService().rechercheParLoginEtMdp(login, mdp);
        Utilisateur util = new UserService().rechercheParLoginEtMdp(login, password);

        //request.getSession().setAttribute("utilConnecte", util);

        response.sendRedirect("home_page?sign_in=true");
        //response.sendRedirect("home_page");

    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("sign_in.jsp").forward(req, resp);
    }
    
    

}
