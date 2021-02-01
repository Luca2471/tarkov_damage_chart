package com.example.application.controllers;

import com.example.application.models.AmmoType;
import com.example.application.repositories.AmmoTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/ammotypes")
public class AmmoTypeController {
    @Autowired
    AmmoTypeRepository ammoTypeRepository;

    @GetMapping
    public List<AmmoType> getAllAmmoTypes(){
        return ammoTypeRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<AmmoType> getAmmoType(@PathVariable Long id) {
        return ammoTypeRepository.findById(id);
    }

}
