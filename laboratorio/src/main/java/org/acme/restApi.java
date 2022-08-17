package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/person")
public class restApi {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello() {
        
        user person = new user("Erik", "evergarah2000@gmail.com", "admin");
        
        return Response.ok(person).build();
    }
}