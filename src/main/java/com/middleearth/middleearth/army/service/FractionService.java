package com.middleearth.middleearth.army.service;

import com.middleearth.middleearth.army.model.Fraction;
import com.middleearth.middleearth.army.model.request.AddFractionRequest;
import com.middleearth.middleearth.army.model.request.UpdateFractionRequest;
import com.middleearth.middleearth.army.repository.FractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FractionService {

    @Autowired
    FractionRepository fractionRepository;


    public List<Fraction> getFraction() {
        return fractionRepository.findAll();
    }

    public Fraction addFraction(AddFractionRequest addFractionRequest) {
        Fraction fractionToAdd = new Fraction(
                addFractionRequest.getFractionName(),
                addFractionRequest.getName(),
                addFractionRequest.getAlliegance(),
                addFractionRequest.getSoldiers());
        return fractionRepository.save(fractionToAdd);

    }


    public void deleteFraction(int id) {
        fractionRepository.deleteById(id);

    }


    public Fraction updateFraction(UpdateFractionRequest updateFractionRequest, int id) {
        Fraction fraction = fractionRepository.getOne(id);
        fraction.setName(updateFractionRequest.getName());
        fraction.setAlliegance(updateFractionRequest.getAlliegance());
        fraction.setSoldiers(updateFractionRequest.getSoldiers());
        return fractionRepository.save(fraction);
    }
}
