/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.location.services;

import com.location.dao.UserDAO;
import com.location.entities.User;

/**
 *
 * @author admin
 */
public class UserService {

    public void signUpUser(User user) {
        UserDAO dao = new UserDAO();
        dao.signUpUser(user);
    }    

    
    
}
