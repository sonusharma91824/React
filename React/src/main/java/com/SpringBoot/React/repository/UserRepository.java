package com.SpringBoot.React.repository;

import com.SpringBoot.React.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
