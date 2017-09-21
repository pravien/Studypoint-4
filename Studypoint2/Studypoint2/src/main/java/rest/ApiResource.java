/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import tester.Tester;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import tester.Group;


/**
 * REST Web Service
 *
 * @author Pravien
 */
@Path("group")
public class ApiResource
{

    @Context
    private UriInfo context;
    Tester test = new Tester();
    List<Group> groups;

    /**
     * Creates a new instance of ApiResource
     */
    
    /**
     * Retrieves representation of an instance of rest.ApiResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() throws InterruptedException, ExecutionException
    {
        //TODO return proper representation object
        if(groups.isEmpty()){
            groups=test.fetchData();
        }
       return new Gson().toJson(test.fetchData());
    }

    /**
     * PUT method for updating or creating an instance of ApiResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content)
    {
    }
}
