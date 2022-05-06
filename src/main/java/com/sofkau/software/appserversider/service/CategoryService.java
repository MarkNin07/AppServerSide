package com.sofkau.software.appserversider.service;

import com.sofkau.software.appserversider.models.entities.Category;
import com.sofkau.software.appserversider.models.entities.Chores;
import org.springframework.stereotype.Service;

import java.util.List;

//The logic for creating a service component class file is shown here (CRUD)
@Service
public interface CategoryService {

    Category createCategory(Category category);

    Category createChores(Chores chore);

    Category updateChores(Chores chore);

    void deleteCategory(Category category);

    void deleteChores(Chores chores);

    List<Category> findAllCategories();

}
