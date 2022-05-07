package com.sofkau.software.appserversider.models.entities;

import lombok.Data;
import javax.persistence.*;

//Object-Relational Mapping (ORM)
//@Entity tells the ORM that this model will be used to represent a table or relation in our database
//@Table tells the ORM what table name in the underlying database that this model corresponds to.

@Entity(name="Chores")
@Table(name="chores")

public class Chores {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private boolean done;

    private Long fkCategoryId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Long getFkCategoryId() {
        return fkCategoryId;
    }

    public void setFkCategoryId(Long fkCategoryId) {
        this.fkCategoryId = fkCategoryId;
    }
}
