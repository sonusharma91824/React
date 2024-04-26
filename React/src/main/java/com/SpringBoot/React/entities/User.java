
package com.SpringBoot.React.entities;

import jakarta.persistence.*;
import lombok.Data;



@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy =
            GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name="last_name")
    private  String lastName;

    @Column(name = "email")
    private  String email;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "country_id", referencedColumnName = "id")
    private Country country;

}



