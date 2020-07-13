package com.unifun.internship;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HeroesRole {
    @Id
    private long id;


    private String roleName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
