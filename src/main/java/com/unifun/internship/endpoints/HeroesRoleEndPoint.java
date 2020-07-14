package com.unifun.internship.endpoints;

import com.unifun.internship.orm.HeroesRole;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/heroes_Role")
public class HeroesRoleEndPoint {

    @GET
    @Path("/role")
    public String getRole(){return HeroesRole.listAll().toString();}

    @GET
    @Path("/DeleteById")
    @Transactional
    public String deleteById(@QueryParam("id") long id){
        return HeroesRole.deleteById(id) ? "deleted" : "not deleted";

    }
}
