package com.example.custom_data_jpa.service;

import com.example.custom_data_jpa.entity.Person;

import java.util.List;

public interface PersonService {
   List<Person>getAllPersonByFirstName(String firstName);
   List<Person>findByFirstNameAndLastName(String firstName, String lastName);
   List<Person>findAllPersonByPhoneNumber(String phone);
   List<Person>findAllPerson();
   void deletePersonById(Long id);
}
