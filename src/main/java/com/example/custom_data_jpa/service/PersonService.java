package com.example.custom_data_jpa.service;

import com.example.custom_data_jpa.entity.Person;

import java.util.List;

public interface PersonService {
   List<Person>getAllPersonByFirstName(String firstName);
   List<Person> getAllPersonEntityByFirstName(String firstName);
   List<Person>findByFirstNameAndLastName(String firstName, String lastName, List<Person> personList);
   List<Person>findAllPersonByPhoneNumber(String phone);
}
