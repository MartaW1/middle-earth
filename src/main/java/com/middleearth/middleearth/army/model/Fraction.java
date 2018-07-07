package com.middleearth.middleearth.army.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Fraction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;

    @Column
    private String fractionName;

    @Column
    private Group name;

    @Column
    private Allegiance alliegance;

    @OneToMany
    private List<Soldier> soldiers;

    public Fraction(String fractionName, Group name, Allegiance alliegance, List<Soldier> soldiers) {
        this.fractionName = fractionName;
        this.name = name;
        this.alliegance = alliegance;
        this.soldiers = soldiers;
    }
}
