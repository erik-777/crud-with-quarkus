/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.acme;

/**
 *
 * @author erikvergara
 */
public class user {
    // Definicion de Atributos
    private String nombre;
    private String userName;
    private String userPassword;
// constructor
    public user(String nombre, String userName, String userPassword) {
        this.nombre = nombre;
        this.userName = userName;
        this.userPassword = userPassword;
    }
//getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    
    
}
