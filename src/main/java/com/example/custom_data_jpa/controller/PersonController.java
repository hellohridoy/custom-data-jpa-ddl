package com.example.custom_data_jpa.controller;

import com.example.custom_data_jpa.entity.Person;
import com.example.custom_data_jpa.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(("api/v1/person"))
public class PersonController {

    @Autowired
    PersonServiceImpl personServiceImpl;

    @PostMapping("/addPerson")
    public Person savePerson(@RequestBody Person person) {
        return personServiceImpl.savePerson(person);
    }

    @GetMapping("/getAllPersonByFirstName")
    public List<Person> getAllPersonByFirstName( @RequestParam String firstName) {
        return personServiceImpl.getAllPersonByFirstName(firstName);
    }
    @GetMapping("/getAllPersonByFirstNameAndLastName")
    public List<Person> getAllPersonByFirstNameAndLastName( @RequestParam String firstName, @RequestParam String lastName) {
        return personServiceImpl.findByFirstNameAndLastName(firstName,lastName);
    }

    @GetMapping("/allPerson")
    public List<Person> getAllPerson() {
        return personServiceImpl.findAllPerson();
    }

    @DeleteMapping("/deletedById/{id}")
    public void deletePersonById(@PathVariable Long id) {
        personServiceImpl.deletePersonById(id);
    }

}
