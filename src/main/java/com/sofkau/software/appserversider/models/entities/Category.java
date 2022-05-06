package com.sofkau.software.appserversider.models.entities;

import lombok.Data;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//Object-Relational Mapping (ORM)
//@Entity tells the ORM that this model will be used to represent a table or relation in our database
//@Table tells the ORM what table name in the underlying database that this model corresponds to.

@Entity(name="Category")
@Table(name="CATEGORY")
@Data
public class Category {

    //Id tells the ORM that this field (id) will be used to uniquely identify a single entry in our "CATEGORY" relation
    //GeneratedValue means the id should be “auto-generated” by the database

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    private List<Chores> choresList = new ArrayList<>();

    public Category addChore(Chores chore) {
        this.choresList.add(chore);
        return this;
    }


}
