package com.sofkau.software.appserversider.models.dto;

import com.sofkau.software.appserversider.models.entities.Chores;
import java.util.ArrayList;
import java.util.List;


public class CategoryDTO {

    private Long categoryId;

    private String categoryName;

    private List<Chores> choresList = new ArrayList<>();

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Chores> getChoresList() {
        return choresList;
    }

    public void setChoresList(List<Chores> choresList) {
        this.choresList = choresList;
    }
}
