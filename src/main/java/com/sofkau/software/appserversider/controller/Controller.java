package com.sofkau.software.appserversider.controller;


import com.sofkau.software.appserversider.models.dto.CategoryDTO;
import com.sofkau.software.appserversider.models.dto.ChoresDTO;
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
    public List<CategoryDTO> getAllCategories(){
        return service.findAllCategories();
    }

    //RequestBody allows Spring to automatically deserialize the HTTP request body into a Java Object
    //which can be bound to the method and further processed
    @PostMapping("create/category")
    public CategoryDTO createCategory(@RequestBody CategoryDTO categoryDTO){
        return service.createCategory(categoryDTO);
    }

    @PutMapping("update/chores")
    public CategoryDTO updateChore(@RequestBody ChoresDTO choresDTO){
        return service.updateChores(choresDTO);
    }

    @PostMapping("create/chores")
    public CategoryDTO createChore(@RequestBody ChoresDTO choresDTO){
        return service.createChores(choresDTO);
    }

    @DeleteMapping("delete/category/{id}")
    public void deleteCategory(@PathVariable("id") Long id ){
        service.deleteCategory(id);
    }

    @DeleteMapping("delete/chores/{id}")
    public void deleteChore(@PathVariable("id") Long id){
        service.deleteChores(id);
    }

}
