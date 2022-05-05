package com.sofkau.software.appserversider.repository;


import com.sofkau.software.appserversider.models.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository <Category, Long> {

}
