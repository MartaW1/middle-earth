package com.middleearth.middleearth.army.controller;

import com.middleearth.middleearth.army.model.Fraction;
import com.middleearth.middleearth.army.model.request.AddFractionRequest;
import com.middleearth.middleearth.army.model.request.UpdateFractionRequest;
import com.middleearth.middleearth.army.service.FractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/fraction")
public class FractionController {
    @Autowired
    FractionService fractionService;

    @GetMapping
    public List<Fraction> getFraction() {
        return fractionService.getFraction();
    }

    @PostMapping
    public Fraction addFraction(@RequestBody AddFractionRequest addFractionRequest) {
        return fractionService.addFraction(addFractionRequest);
    }

    @PutMapping(path = "/{id}")
    public Fraction updateFraction(@RequestBody UpdateFractionRequest updateFractionRequest,
                                   @PathVariable int id) {
        return fractionService.updateFraction(updateFractionRequest, id);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteFraction(@PathVariable int id) {
        fractionService.deleteFraction(id);
    }
}

