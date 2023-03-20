package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.daccesso.PersonDao;
import com.example.demo.model.Person;


@Service
public class PersonService {
    
    private final PersonDao personDao;

public PersonService(@Qualifier("fakedao") 
    PersonDao personDao) {
    
        this.personDao = personDao;
    
    }

    public int addPerson(Person person) {
        return personDao.insertPerson(person);
    }

    public List<Person> getAllPeople() {
        return personDao.selectAllpeople();
    }

}
