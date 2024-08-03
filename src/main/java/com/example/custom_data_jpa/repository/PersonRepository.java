package com.example.custom_data_jpa.repository;

import com.example.custom_data_jpa.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {

    @Query("FROM Person WHERE firstName = ?1")
    List<Person> getAllPersonByFirstName(String firstName);

    @Query("SELECT a FROM Person a where a.firstName = ?1 AND a.lastName = ?2")
    List<Person> findByFirstNameAndLastName(String firstName, String lastName);

    @Query("SELECT a FROM Person a where a.phone = :phone")
    List<Person> findAllPersonByPhoneNumber(@Param("phone") String phone);


}
