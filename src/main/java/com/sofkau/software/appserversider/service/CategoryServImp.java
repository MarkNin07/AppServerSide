package com.sofkau.software.appserversider.service;


import com.sofkau.software.appserversider.models.entities.Category;
import com.sofkau.software.appserversider.models.entities.Chores;
import com.sofkau.software.appserversider.repository.CategoryRepository;
import com.sofkau.software.appserversider.repository.ChoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServImp implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepo;

    @Autowired
    private ChoresRepository choresRepo;




    @Override
    public Category createCategory(Category category) {
        return categoryRepo.save(category);
    }

    @Override
    public Category createChores(Chores chore) {
        Category category = categoryRepo.findById(chore.getFkCategoryId()).get();
        category.addChore(chore);
        choresRepo.save(chore);
        return categoryRepo.save(category);
    }

    @Override
    public Category updateChores(Chores chore) {
        Category category = categoryRepo.findById(chore.getFkCategoryId()).get();
        choresRepo.save(chore);
        return categoryRepo.save(category);
    }

    @Override
    public void deleteCategory(Category category) {
        Category categoryToDelete = categoryRepo.findById(category.getId()).get();
        if(categoryToDelete.getChoresList().size() >= 0){
            categoryToDelete.getChoresList().forEach(chore -> choresRepo.deleteById(chore.getId()));
        }
        categoryRepo.deleteById(category.getId());

    }

    @Override
    public void deleteChores(Chores chores) {
        choresRepo.deleteById(chores.getId());
    }

    @Override
    public List<Category> findAllCategories() {
        return categoryRepo.findAll();
    }
}
