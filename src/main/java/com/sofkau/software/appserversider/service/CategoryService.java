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

    void deleteCategory(Long id);

    void deleteChores(Long id);

    List<Category> findAllCategories();

}
