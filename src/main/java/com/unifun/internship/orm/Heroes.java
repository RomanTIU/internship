package com.unifun.internship.orm;

import com.unifun.internship.orm.enums.Attribute;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "heroes")


public class Heroes extends PanacheEntityBase {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   public long id;
   public String heroName;
   public Attribute attribute;

   @ManyToMany(cascade = {CascadeType.ALL})
   Set<HeroesRole> heroesRoles;

    @Override
    public String toString() {
        return "Heroes{" +
                "heroName='" + heroName + '\'' +
                ", attribute=" + attribute +
                ", heroesRoles=" + heroesRoles +
                '}';
    }

    public String getName() {
        return heroName;
    }

    public void setName(String name) {
        this.heroName = name;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }
}
