package com.unifun.internship.endpoints;


import com.unifun.internship.orm.Heroes;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/heroes")
public class HeroesEndPoint {

    @GET
    @Path("list")
    @Transactional
    public String getList(){
        return Heroes.listAll().toString();
    }


}
