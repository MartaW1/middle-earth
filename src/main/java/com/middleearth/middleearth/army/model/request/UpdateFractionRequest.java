package com.middleearth.middleearth.army.model.request;

import com.middleearth.middleearth.army.model.Allegiance;
import com.middleearth.middleearth.army.model.Group;
import com.middleearth.middleearth.army.model.Soldier;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class UpdateFractionRequest {
    private String fractionName;
    private Group name;
    private Allegiance alliegance;
    private List<Soldier> soldiers;

}
