package com.middleearth.middleearth.army.service;

import com.middleearth.middleearth.army.model.Soldier;
import com.middleearth.middleearth.army.model.request.AddSoldierRequest;
import com.middleearth.middleearth.army.repository.SoldierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class SoldierService {
    @Autowired
    SoldierRepository soldierRepository;

    public List<Soldier> getSoldier() {
        return soldierRepository.findAll();
    }

    public Soldier addSoldier(AddSoldierRequest addSoldierRequest) {
        Soldier soldier = new Soldier(addSoldierRequest.getName(),
                addSoldierRequest.isOficer(),
                addSoldierRequest.getRace(),
                addSoldierRequest.getSkills(),
                addSoldierRequest.getWeapons());
        return soldierRepository.save(soldier);
    }

    public Soldier getSoldierWithId(int id) {
        return soldierRepository.getOne(id);
    }
}
