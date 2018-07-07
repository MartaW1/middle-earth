package com.middleearth.middleearth.army.repository;

import com.middleearth.middleearth.army.model.Soldier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoldierRepository extends JpaRepository<Soldier, Integer> {
}
