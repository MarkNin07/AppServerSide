package com.sofkau.software.appserversider.controller;


import com.sofkau.software.appserversider.models.entities.Category;
import com.sofkau.software.appserversider.models.entities.Chores;
import com.sofkau.software.appserversider.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//RestController will handle responses to HTTP requests. RestController = Controller + ResponseBody
@RestController
//This Controller adds response body to each method that exposes a RequestMapping
@RequestMapping("api/")
@CrossOrigin(origins = "http://localhost:3000/")
public class Controller {

    @Qualifier("categoryServImp")
    @Autowired
    private CategoryService service;

    @GetMapping("get/categories")
    public List<Category> getAllCategories(){
        return service.findAllCategories();
    }

    //RequestBody allows Spring to automatically deserialize the HTTP request body into a Java Object
    //which can be bound to the method and further processed
    @PostMapping("create/category")
    public Category createCategory(@RequestBody Category category){
        return service.createCategory(category);
    }

    @PutMapping("update/chores")
    public Category updateChore(@RequestBody Chores chore){
        return service.updateChores(chore);
    }

    @PostMapping("create/chores")
    public Category createChore(@RequestBody Chores chore){
        return service.createChores(chore);
    }

    @DeleteMapping("delete/category")
    public void deleteCategory(@RequestBody Category category){
        service.deleteCategory(category);
    }

    @DeleteMapping("delete/chores")
    public void deleteChore(@RequestBody Chores chore){
        service.deleteChores(chore);
    }

}
