package com.SpringBoot.React.dto;
import lombok.Data;

@Data
public class UserDto {
    private long id ;
    private String firstName;
    private String lastName;
    private  String email;
    private CountryDto countryDto;
}
