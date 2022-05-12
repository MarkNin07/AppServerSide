package com.sofkau.software.appserversider.service;

import com.sofkau.software.appserversider.models.dto.CategoryDTO;
import com.sofkau.software.appserversider.models.dto.ChoresDTO;
import com.sofkau.software.appserversider.models.entities.Category;
import com.sofkau.software.appserversider.models.entities.Chores;
import org.springframework.stereotype.Service;

import java.util.List;

//The logic for creating a service component class file is shown here (CRUD)
@Service
public interface CategoryService {

    CategoryDTO createCategory(CategoryDTO categoryDTO);

    CategoryDTO createChores(ChoresDTO choresDTO);

    CategoryDTO updateChores(ChoresDTO choresDTO);

    void deleteCategory(Long id);

    void deleteChores(Long id);

    List<CategoryDTO> findAllCategories();

}
