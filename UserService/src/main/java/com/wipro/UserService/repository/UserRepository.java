package com.wipro.UserService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.UserService.repository.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
