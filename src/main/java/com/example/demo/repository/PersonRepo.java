package com.example.demo.repository;

import com.example.demo.model.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepo extends CrudRepository<Person,Integer> {
//    List<Person> findByNameLike(String pattern);
//    @Query("select * from Person" )
    List<Person> findAll();
}
//