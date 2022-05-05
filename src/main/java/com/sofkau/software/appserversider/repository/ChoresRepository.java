package com.sofkau.software.appserversider.repository;

import com.sofkau.software.appserversider.models.entities.Chores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ChoresRepository extends JpaRepository<Chores, Long> {
}
