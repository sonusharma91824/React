package com.SpringBoot.React.service.impl;

import com.SpringBoot.React.entities.Country;
import com.SpringBoot.React.entities.User;
import com.SpringBoot.React.repository.CountryRepository;
import com.SpringBoot.React.repository.UserRepository;
import com.SpringBoot.React.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public User createAccount(User user) {
        Long countryId = user.getCountry().getId();

        Country country = countryRepository
                .findById(countryId)
                .orElseThrow(() -> new IllegalArgumentException("Country not found with ID: " + countryId));

        user.setCountry(country);

        return userRepository.save(user);
    }

}



