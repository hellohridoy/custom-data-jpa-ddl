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
    PersonServiceImpl personService;

    @PostMapping("/addPerson")
    public Person savePerson(@RequestBody Person person) {
        return personService.savePerson(person);
    }

    @GetMapping("/getAllPersonByFirstName")
    public List<Person> getAllPersonByFirstName( @RequestParam String firstName) {
        return personService.getAllPersonByFirstName(firstName);
    }

}
