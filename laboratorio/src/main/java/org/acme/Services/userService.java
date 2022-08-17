package org.acme.Services;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import org.acme.Entity.userEntity;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

//Anotacion que permite inyectar la clase en el controlador
@ApplicationScoped
//se implementa la de la clase panache repository y se le pasa la clase pollo
public class userService implements PanacheRepository <userEntity>{
     
//    public List<userEntity> listUser(){
//        return userEntity.listAll();
//    }
}