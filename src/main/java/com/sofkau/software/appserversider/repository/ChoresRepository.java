package com.sofkau.software.appserversider.repository;

import com.sofkau.software.appserversider.models.entities.Chores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//It indicates that the decorated class is a repository.
//Extends from JpaRepository means to be able to execute all the CRUD methods
@Repository
public interface ChoresRepository extends JpaRepository<Chores, Long> {
}
