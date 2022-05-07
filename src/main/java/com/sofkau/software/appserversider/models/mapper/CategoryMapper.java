package com.sofkau.software.appserversider.models.mapper;


import com.sofkau.software.appserversider.models.dto.CategoryDTO;
import com.sofkau.software.appserversider.models.entities.Category;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses={ChoresMapper.class})
public interface CategoryMapper {

        //Turn entities into ToDoDTO
    CategoryDTO convertToToDoDTO(Category category);
    //Turn an Entities List into ToDoDTO List
    List<CategoryDTO> convertToList(List<Category> categories);
    @InheritInverseConfiguration
        //Turn ToDoDTO into Entities
    Category convertToEntities(CategoryDTO todoDTO);
}
