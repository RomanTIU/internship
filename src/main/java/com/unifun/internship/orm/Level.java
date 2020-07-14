package com.unifun.internship.orm;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;

@Entity(name="level")
public class Level {
    @Id
    private long id;
    @Max(30)
    private int level;

    @ManyToOne

    private Heroes heroes;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
