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
public class Soldier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;
    @Column
    private String name;
    @Column
    private boolean oficer;
    @Column
    private Race race;
    @OneToMany
    private List<Skill> skills;
    @OneToMany
    private List<Weapon> weapons;

    public Soldier(String name, boolean oficer, Race race, List<Skill> skills, List<Weapon> weapons) {
        this.name = name;
        this.oficer = oficer;
        this.race = race;
        this.skills = skills;
        this.weapons = weapons;
    }

}
