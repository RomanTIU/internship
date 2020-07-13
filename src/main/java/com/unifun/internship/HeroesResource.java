package com.unifun.internship;

import io.agroal.api.AgroalDataSource;
import io.quarkus.agroal.DataSource;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Path("heroes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class HeroesResource {
        @Inject
        @DataSource("heroes")
        AgroalDataSource dataSource;
        Connection conn = dataSource.getConnection();
        Statement stmt = conn.createStatement();

    public static void main(String[] args) {

    }

    public HeroesResource() throws SQLException {
        }
    }

