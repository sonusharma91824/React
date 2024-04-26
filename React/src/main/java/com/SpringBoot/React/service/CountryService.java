package com.SpringBoot.React.service;

import com.SpringBoot.React.dto.CountryDto;
import com.SpringBoot.React.entities.Country;

import java.util.List;

public interface CountryService {

//       public CountryDto postCountry(Country country);

    List<CountryDto> getAllCountry();
}

