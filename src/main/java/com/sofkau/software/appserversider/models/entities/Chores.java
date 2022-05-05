package com.sofkau.software.appserversider.models.entities;


import lombok.Data;

import javax.persistence.*;

@Entity(name="Chores")
@Table(name="CHORES")
@Data
public class Chores {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String description;

    private boolean done;

    private Long fkCategoryId;


}
