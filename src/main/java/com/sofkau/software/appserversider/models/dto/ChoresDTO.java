package com.sofkau.software.appserversider.models.dto;

public class ChoresDTO {

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
