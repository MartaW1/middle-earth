package com.middleearth.middleearth.army.controller;

import com.middleearth.middleearth.army.model.Soldier;
import com.middleearth.middleearth.army.model.request.AddSoldierRequest;
import com.middleearth.middleearth.army.service.SoldierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/soldier")
public class SoldierController {
    @Autowired
    SoldierService soldierService;

    @GetMapping
    public List<Soldier> getSoldier() {
        return soldierService.getSoldier();
    }

    @PostMapping
    public Soldier addSoldier(@RequestBody AddSoldierRequest addSoldierRequest) {
        return soldierService.addSoldier(addSoldierRequest);

    }

    @GetMapping(path = "/{id}")
    public Soldier getSoldierWithId(@PathVariable int id) {
        return soldierService.getSoldierWithId(id);
    }

}
