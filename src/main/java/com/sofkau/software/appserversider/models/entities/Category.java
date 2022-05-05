package com.sofkau.software.appserversider.models.entities;

import lombok.Data;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity(name="Category")
@Table(name="CATEGORY")
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

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
