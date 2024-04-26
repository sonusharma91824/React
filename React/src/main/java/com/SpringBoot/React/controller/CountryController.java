package com.SpringBoot.React.controller;

import com.SpringBoot.React.dto.CountryDto;
import com.SpringBoot.React.entities.Country;
import com.SpringBoot.React.repository.CountryRepository;
import com.SpringBoot.React.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/country")
@CrossOrigin("*")
public class CountryController {
    @Autowired
    CountryService countryService;
    @Autowired
    CountryRepository countryRepository;
    @Autowired
    private Country countryDto;

    public CountryController(Country countryDto) {
        this.countryDto = countryDto;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<CountryDto>> getAll() {
        List<CountryDto> countries = countryService.getAllCountry();
        return ResponseEntity.ok(countries);

        }


    

    }



