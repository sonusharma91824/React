package com.SpringBoot.React.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "country")
@Data
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "country_name")
    private String countryName;

    @OneToOne(mappedBy = "country")
    private User user;


    public long getCountryId() {
        return Id;
    }
}





