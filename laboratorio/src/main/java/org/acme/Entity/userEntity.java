/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.acme.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.Panache;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

/**
 *
 * @author erikvergara
 */
@Entity
@Table(name = "users")
public class userEntity extends PanacheEntity {

    // Definicion de Atributos
    // anotacion en donde se indica la columna de la tabla y no null
    @Column(nullable = false)
    String nombre;
    @Column(nullable = false,unique = true)
    String userName;
    @Column(nullable = false)
    String userPassword;

// constructor
    public userEntity() {
    }

    public userEntity(String nombre, String userName, String userPassword) {

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
