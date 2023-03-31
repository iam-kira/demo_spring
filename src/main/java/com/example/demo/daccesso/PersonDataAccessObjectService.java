package com.example.demo.daccesso;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;


@Repository("MSSQL")
public class PersonDataAccessObjectService implements PersonDao {

    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }

    @Override
    public List<Person> selectAllpeople() {
        return List.of(new Person(UUID, randomUUID(), "FROM MSSQL DB"));
        
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return null;
    }

    @Override
    public int deletePersonById(UUID id) {
        return 0;
    }

    @Override
    public int updatePersonById(UUID id, Person person) {
        return 0;
    }
    

    
}
