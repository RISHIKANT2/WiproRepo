package com.example.RestControllerWithDataBaseDemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestControllerWithDataBaseDemo.entity.User;
import com.example.RestControllerWithDataBaseDemo.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {

	
	@Autowired
	UserRepository repo;
	
	public List<User> getAll() {
		return repo.findAll();
	}

	public Optional<User> getUser(int id) {
		return repo.findById(id);
	}

	
	
	public User addUser(User obj) {
		return repo.save(obj);
	}
	
	public void deleteUser(int id) {
		 repo.deleteById(id);
	}
	public User getUserByName(String name) {
		return repo.findByName(name);
	}
	
	@Transactional
	public void deleteByName(String name) {
		repo.deleteByName(name);
	}
}
