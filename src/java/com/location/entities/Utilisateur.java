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
        CLIENT,
        DRIVER
    }
    //********************************
    //Instanciation
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String longitude;
    private String latitude;
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

    public UtilType getTypeOfUtil() {
        return typeOfUtil;
    }

    public void setTypeOfUtil(UtilType typeOfUtil) {
        this.typeOfUtil = typeOfUtil;
    }
    
    

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
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

    

    @Override
    public String toString() {
        return "m2i.store.entities.Utilisateur[ id=" + id + " ]";
    }
    
}
