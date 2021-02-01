package com.example.application.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "ammoTypes")
public class AmmoType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "damage")
    private int damage;

    @Column(name = "pen_value")
    private int penValue;

    @Column(name = "armour_damage")
    private int armorDamage;

    @Column(name = "frag_chance")
    private int fragChance;

    @Column(name = "armor_level_1_effectiveness")
    private int armorLevel1Effectiveness;

    @Column(name = "armor_level_2_effectiveness")
    private int armorLvl2Effectiveness;

    @Column(name = "armor_level_3_effectiveness")
    private int armorLvl3Effectiveness;

    @Column(name = "armor_level_4_effectiveness")
    private int armorLvl4Effectiveness;

    @Column(name = "armor_level_5_effectiveness")
    private int armorLvl5Effectiveness;

    @Column(name = "armor_level_6_effectiveness")
    private int armorLvl6Effectiveness;

    @JsonIgnoreProperties("ammoType")
    @ManyToOne
    @JoinColumn(name = "caliber_id", nullable = false)
    private Caliber caliber;

    public AmmoType(String name, int damage, int penValue, int armorDamage, int fragChance, int armorLvl1Effectiveness, int armorLvl2Effectiveness, int armorLvl3Effectiveness, int armorLvl4Effectiveness, int armorLvl5Effectiveness, int armorLvl6Effectiveness, Caliber caliber) {
        this.name = name;
        this.damage = damage;
        this.penValue = penValue;
        this.armorDamage = armorDamage;
        this.fragChance = fragChance;
        this.armorLevel1Effectiveness = armorLvl1Effectiveness;
        this.armorLvl2Effectiveness = armorLvl2Effectiveness;
        this.armorLvl3Effectiveness = armorLvl3Effectiveness;
        this.armorLvl4Effectiveness = armorLvl4Effectiveness;
        this.armorLvl5Effectiveness = armorLvl5Effectiveness;
        this.armorLvl6Effectiveness = armorLvl6Effectiveness;
        this.caliber = caliber;
    }

    public AmmoType() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPenValue() {
        return penValue;
    }

    public void setPenValue(int penValue) {
        this.penValue = penValue;
    }

    public int getArmorDamage() {
        return armorDamage;
    }

    public void setArmorDamage(int armorDamage) {
        this.armorDamage = armorDamage;
    }

    public int getFragChance() {
        return fragChance;
    }

    public void setFragChance(int fragChance) {
        this.fragChance = fragChance;
    }

    public int getArmorLevel1Effectiveness() {
        return armorLevel1Effectiveness;
    }

    public void setArmorLevel1Effectiveness(int armorLevel1Effectiveness) {
        this.armorLevel1Effectiveness = armorLevel1Effectiveness;
    }

    public int getArmorLvl2Effectiveness() {
        return armorLvl2Effectiveness;
    }

    public void setArmorLvl2Effectiveness(int armorLvl2Effectiveness) {
        this.armorLvl2Effectiveness = armorLvl2Effectiveness;
    }

    public int getArmorLvl3Effectiveness() {
        return armorLvl3Effectiveness;
    }

    public void setArmorLvl3Effectiveness(int armorLvl3Effectiveness) {
        this.armorLvl3Effectiveness = armorLvl3Effectiveness;
    }

    public int getArmorLvl4Effectiveness() {
        return armorLvl4Effectiveness;
    }

    public void setArmorLvl4Effectiveness(int armorLvl4Effectiveness) {
        this.armorLvl4Effectiveness = armorLvl4Effectiveness;
    }

    public int getArmorLvl5Effectiveness() {
        return armorLvl5Effectiveness;
    }

    public void setArmorLvl5Effectiveness(int armorLvl5Effectiveness) {
        this.armorLvl5Effectiveness = armorLvl5Effectiveness;
    }

    public int getArmorLvl6Effectiveness() {
        return armorLvl6Effectiveness;
    }

    public void setArmorLvl6Effectiveness(int armorLvl6Effectiveness) {
        this.armorLvl6Effectiveness = armorLvl6Effectiveness;
    }

    public Caliber getCaliber() {
        return caliber;
    }

    public void setCaliber(Caliber caliber) {
        this.caliber = caliber;
    }

}