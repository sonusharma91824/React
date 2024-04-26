package com.SpringBoot.React.service.impl;

import com.SpringBoot.React.dto.CountryDto;
import com.SpringBoot.React.entities.Country;
import com.SpringBoot.React.repository.CountryRepository;
import com.SpringBoot.React.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountryServiceImpl implements CountryService {
@Autowired
private  CountryDto countryDto;
    @Autowired
    private CountryRepository countryRepository;


    @Override
    public List<CountryDto> getAllCountry() {
        List<Country> con = countryRepository.findAll();
        return con.stream().map(country -> {
            CountryDto countryDto = new CountryDto();
            countryDto.setCountryId(country.getCountryId());
            countryDto.setCountryName(country.getCountryName());
            return countryDto;
        }).collect(Collectors.toList());
    }
}
