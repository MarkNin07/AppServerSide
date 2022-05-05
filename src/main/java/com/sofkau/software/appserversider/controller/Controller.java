package com.sofkau.software.appserversider.controller;


import com.sofkau.software.appserversider.models.entities.Category;
import com.sofkau.software.appserversider.models.entities.Chores;
import com.sofkau.software.appserversider.service.CategoryServiceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class Controller {

    //Why do I have to use the @Qualifier here
    @Qualifier("categoryServiceDAO")
    @Autowired
    private CategoryServiceDAO service;

    @GetMapping("get/categories")
    public List<Category> getAllCategories(){
        return service.findAllCategories();
    }

    @PostMapping("save/category")
    public Category createCategory(@RequestBody Category category){
        return service.createCategory(category);
    }

    @PostMapping("create/chore")
    public Category createChore(@RequestBody Chores chore){
        return service.createChores(chore);
    }

    @DeleteMapping("delete/category")
    public void deleteCategory(@RequestBody Category category){
        service.deleteCategory(category);
    }

    @DeleteMapping("delete/chore")
    public void deleteChore(@RequestBody Chores chore){
        service.deleteChores(chore);
    }

}
