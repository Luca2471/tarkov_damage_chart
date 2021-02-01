package com.example.application.projections;

import com.example.application.models.AmmoType;
import com.example.application.models.Caliber;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedAmmoType", types = AmmoType.class)
public interface EmbedAmmoType {
    String gerName();
    int getDamage();
    int getPenValue();
    int getArmorDamage();
    int getFragChance();
    int getArmorLvl1Effectiveness();
    int getArmorLvl2Effectiveness();
    int getArmorLvl3Effectiveness();
    int getArmorLvl4Effectiveness();
    int getArmorLvl5Effectiveness();
    int getArmorLvl6Effectiveness();
    Caliber Getcaliber();

}
