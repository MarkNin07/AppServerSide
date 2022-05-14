package com.sofkau.software.appserversider.service;


import com.sofkau.software.appserversider.models.dto.CategoryDTO;
import com.sofkau.software.appserversider.models.dto.ChoresDTO;
import com.sofkau.software.appserversider.models.entities.Category;
import com.sofkau.software.appserversider.models.entities.Chores;
import com.sofkau.software.appserversider.models.mapper.CategoryMapper;
import com.sofkau.software.appserversider.models.mapper.ChoresMapper;
import com.sofkau.software.appserversider.repository.CategoryRepository;
import com.sofkau.software.appserversider.repository.ChoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//@Service annotation is used to write business logic in a different layer.
//We're implementing all the methods from our interface (CRUD)
@Service
public class CategoryServImp implements CategoryService {


    @Autowired
    CategoryRepository categoryRepo;

    @Autowired
    ChoresRepository choresRepo;

    @Autowired
    CategoryMapper categoryMapper;

    @Autowired
    ChoresMapper choresMapper;



    @Override
    public CategoryDTO createCategory(CategoryDTO categoryDTO) {
        Category category = categoryMapper.convertToEntities(categoryDTO);
        Category saveEntityCategory = categoryRepo.save(category);
        return categoryMapper.convertToToDoDTO(category);
    }

    @Override
    public CategoryDTO createChores(ChoresDTO choresDTO) {
        Chores chores = choresMapper.convertToEntities(choresDTO);
        choresRepo.save(chores);
        Long fkCategoryId = choresDTO.getFkCategoryId();
        Category category = categoryRepo.findById(fkCategoryId).get();
        category.addChore(chores);
        categoryRepo.save(category);
        return categoryMapper.convertToToDoDTO(category);
    }

    @Override
    public CategoryDTO updateChores(ChoresDTO choresDTO) {
        Chores chores = choresMapper.convertToEntities(choresDTO);
        Chores saveEntityChore = choresRepo.save(chores);
        Long fkCategoryId = choresDTO.getFkCategoryId();
        Category category = categoryRepo.findById(fkCategoryId).get();
        return categoryMapper.convertToToDoDTO(category);
    }

    @Override
    public void deleteCategory(Long id) {
        Category categoryToDelete = categoryRepo.findById(id).get();
        if(categoryToDelete.getChoresList().size() >= 0){
            categoryToDelete.getChoresList().forEach(chore -> choresRepo.deleteById(chore.getId()));
        }
        categoryRepo.deleteById(id);

    }

    @Override
    public void deleteChores(Long id) {
        choresRepo.deleteById(id);
    }

    @Override
    public List<CategoryDTO> findAllCategories() {
        List<Category> categoryList = categoryRepo.findAll();
        return categoryMapper.convertToList(categoryList);
    }
}
