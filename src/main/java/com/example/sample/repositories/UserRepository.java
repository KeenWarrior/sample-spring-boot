package com.example.sample.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.sample.controllers.HomeController.User;

public interface UserRepository extends CrudRepository<User, Long>{
}
