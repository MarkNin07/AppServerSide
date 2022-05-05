package com.sofkau.software.appserversider.models.dto;

import com.sofkau.software.appserversider.models.entities.Chores;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ToDoDTO implements Serializable{


    private Long id;

    private List<Chores> choresList = new ArrayList<>();

    private String title;

    private String description;

    private boolean done;

    private Long fkCategoryId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Chores> getChoresList() {
        return choresList;
    }

    public void setChoresList(List<Chores> choresList) {
        this.choresList = choresList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public void setFkCategoryId(Long fkChoresId) {
        this.fkCategoryId = fkChoresId;
    }

}
