package com.sofkau.software.appserversider.models.mapper;

import com.sofkau.software.appserversider.models.dto.ChoresDTO;
import com.sofkau.software.appserversider.models.entities.Chores;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ChoresMapper {

    //Turn entities into ToDoDTO
    ChoresDTO convertToToDoDTO(Chores task);
    //Turn an Entities List into ToDoDTO List
    List<ChoresDTO> convertToList(List<Chores> tasks);
    @InheritInverseConfiguration
    //Turn ToDoDTO into Entities
    Chores convertToEntities(ChoresDTO todoDTO);

}
