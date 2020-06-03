package com.hzit.service;

import com.hzit.model.Person;

public interface IPersonService {
    public void save(String name);
    public void savePerson(Person person);
    public String getPersonName(int id);
    public String findAll();
}
