package com.SpringBoot.React.dto;

import com.SpringBoot.React.entities.Country;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

@Data

public class CountryDto {
    private long countryId ;
    private String countryName;



}
