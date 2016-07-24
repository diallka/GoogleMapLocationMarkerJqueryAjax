/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.location.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author admin
 */
@Entity
public class Utilisateur implements Serializable {
    
    //Définition enum Type Utilisateur
    public enum UtilType {
        ADMIN,
        CLIENT,
        DRIVER
    }
    //********************************
    //Instanciation
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String login;
    private String password;
    
    @Enumerated(EnumType.STRING)
    public UtilType typeOfUtil;
    
    
    
    //**********************************
    //Getter et Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String mdp) {
        this.password = mdp;
    }

    
    public UtilType getTypeUtil() {
        return typeOfUtil;
    }

    public void setTypeUtil(UtilType typeUtil) {
        this.typeOfUtil = typeUtil;
    }
    

    @Override
    public String toString() {
        return "m2i.store.entities.Utilisateur[ id=" + id + " ]";
    }
    
}
