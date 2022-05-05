package com.sofkau.software.appserversider.service;

import com.sofkau.software.appserversider.models.entities.Category;
import com.sofkau.software.appserversider.models.entities.Chores;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryServiceDAO {

    Category createCategory(Category category);

    Category createChores(Chores chore);

    Chores updateChores(Chores chore);

    void deleteCategory(Category category);

    void deleteChores(Chores chores);

    List<Category> findAllCategories();

}
