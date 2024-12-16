package com.example.spring_boot_universities_api.controller;

import com.example.spring_boot_universities_api.model.PojoB;
import com.example.spring_boot_universities_api.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/universities")
public class UniversityController {

    private final UniversityService universityService;

    @Autowired
    public UniversityController(UniversityService universityService) {
        this.universityService = universityService;
    }

    @PostMapping("/by-countries")
    public List<PojoB> getUniversities(@RequestBody List<String> countries) {
        return universityService.getUniversitiesByMultipleCountries(countries);
    }
}
