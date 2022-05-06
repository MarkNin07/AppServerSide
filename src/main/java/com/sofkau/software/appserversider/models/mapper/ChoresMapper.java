package com.sofkau.software.appserversider.models.mapper;

import com.sofkau.software.appserversider.models.dto.ChoresDTO;
import com.sofkau.software.appserversider.models.entities.Chores;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ChoresMapper {
/*
    @Mappings({
            @Mapping(source="id", target= "id"),
            @Mapping(source="title", target="title"),
            @Mapping(source="done", target="done"),
            @Mapping(source="fkCategoryId", target="fkCategoryId")
    })
*/
    //Turn entities into ToDoDTO
    ChoresDTO convertToToDoDTO(Chores task);
    //Turn an Entities List into ToDoDTO List
    List<ChoresDTO> convertToList(List<Chores> tasks);
    @InheritInverseConfiguration
    //Turn ToDoDTO into Entities
    Chores convertToEntities(ChoresDTO todoDTO);

}
