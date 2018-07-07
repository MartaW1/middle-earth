package com.middleearth.middleearth.army.model.request;

import com.middleearth.middleearth.army.model.Race;
import com.middleearth.middleearth.army.model.Skill;
import com.middleearth.middleearth.army.model.Weapon;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class AddSoldierRequest {
    private String name;
    private boolean oficer;
    private Race race;
    private List<Skill> skills;
    private List<Weapon> weapons;
}
