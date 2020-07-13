package com.unifun.internship;

import com.unifun.internship.enums.Attribute;

import javax.persistence.*;

@Entity
public class Heroes  {
    @Id
    private long id ;

    private String name;

    @ManyToOne
    private HeroesRole role;

    
    private Attribute attribute;

    @ManyToOne
    private Level level;



    public HeroesRole getRole() {
        return role;
    }

    public void setRole(HeroesRole role) {
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }
}
