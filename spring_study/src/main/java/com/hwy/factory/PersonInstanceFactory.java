package com.hwy.factory;

import com.hwy.bean.Person;

public class PersonInstanceFactory {
    public Person getInstance(String name) {
        Person person = new Person();
        person.setId(2);
        person.setName(name);
        person.setAge(28);
        return person;

    }

}
