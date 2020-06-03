package com.hzit.service.impl;

import com.hzit.model.Person;
import com.hzit.service.IPersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements IPersonService {
    public PersonServiceImpl() {
        super();
    }

    @Override
    public void save(String name) {
      System.out.print("save");
    }

    @Override
    public void savePerson(Person person) {
    System.out.print("savePerson");
    }

    @Override
    public String getPersonName(int id) {
        System.out.print("getPersonName");
        return null;
    }

    @Override
    public String findAll() {
        System.out.print("findAll");
        return null;
    }
}
