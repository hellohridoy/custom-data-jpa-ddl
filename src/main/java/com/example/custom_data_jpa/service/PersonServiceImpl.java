package com.example.custom_data_jpa.service;

import com.example.custom_data_jpa.entity.Person;
import com.example.custom_data_jpa.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonRepository personRepository;


   public Person savePerson(Person person) {
        return personRepository.save(person);
   }


    @Override
    public List<Person> getAllPersonByFirstName(String firstName) {
        return personRepository.getAllPersonByFirstName(firstName);
    }

    @Override
    public List<Person> getAllPersonEntityByFirstName(String firstName) {
        return List.of();
    }

    @Override
    public List<Person> findByFirstNameAndLastName(String firstName, String lastName, List<Person> personList) {
        return List.of();
    }

    @Override
    public List<Person> findAllPersonByPhoneNumber(String phone) {
        return List.of();
    }
}
