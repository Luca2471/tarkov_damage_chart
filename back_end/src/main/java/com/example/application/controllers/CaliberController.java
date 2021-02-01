package com.example.application.controllers;

import com.example.application.models.Caliber;
import com.example.application.repositories.CaliberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/calibers")
public class CaliberController {

    @Autowired
    CaliberRepository caliberRepository;

    @GetMapping
    public List<Caliber> getAllCalibers() {
        return caliberRepository.findAll();
    }
}
