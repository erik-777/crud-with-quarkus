package org.acme.Controller;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.acme.Entity.userEntity;
import org.acme.Services.userService;
//anotacion con la cual se identidfica la clase del controlador
@Path("user")
//anotacion en donde se indica el tipo de datos que se van a consumir en este caso se consumen Json
//es una mala practica debido a que cada metodo de la clase se le debe especificar el tipo de datos que consumen o producen
@Consumes(MediaType.APPLICATION_JSON)
//anotacion en donde se indica el tipo de datos que se van a producir en este caso se consumen Json
@Produces(MediaType.APPLICATION_JSON)
public class userController {
    
    @Inject
    //creacion de un objeto de la clase usuario
    userService service;
    //anotacion que indica en metodo por el cual se consume el metodo
    @GET
    public Response listUser(){
        List<userEntity> usuarios = service.listAll();
      return Response.ok(usuarios).build();
    }
    
}
