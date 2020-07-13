package com.unifun.internship;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;

@Entity
public class Level {
    @Id
    private long id;
    @Max(30)
    private int level;

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
