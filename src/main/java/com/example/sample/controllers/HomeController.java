package com.example.sample.controllers;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.repositories.UserRepository;


@RestController
public class HomeController {
    
    @Autowired
    UserRepository repository;
    
    
    @GetMapping("/user")
    public User getUser(){
        return repository.findAll().iterator().next();
    } 
    
    @PostMapping("/user")
    public void postUser(){
         repository.save(new User("Anuj", "23"));
    }    
    

    @Entity
    public static class User{
        
        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        public long id;
        public String name;
        public String age;
        
        
        public User (String name,String age) {
            
            this.name = name;
            this.age = age;
        }
    }
}
