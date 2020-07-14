package com.unifun.internship.orm;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity(name = "heroes_role")

public class HeroesRole extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    public String roleName;

    @Override
    public String toString() {
        return "Role{" +
                "Role name='" + roleName + '\'' +
                '}';
    }
}
