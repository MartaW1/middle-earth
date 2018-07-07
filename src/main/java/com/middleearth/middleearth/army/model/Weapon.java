package com.middleearth.middleearth.army.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Weapon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;
    @Column
    private int dps;
    @Column
    private int range;
    @Column
    private String name;

    public Weapon(int dps, int range, String name) {
        this.dps = dps;
        this.range = range;
        this.name = name;
    }
}
