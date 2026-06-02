package com.wipro.ReactiveDemo.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.wipro.ReactiveDemo.model.User;

@Repository
public interface UserRepo extends ReactiveMongoRepository<User, Integer>{

}
