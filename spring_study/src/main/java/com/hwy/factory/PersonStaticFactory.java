package com.hwy.factory;

import com.hwy.bean.Person;

public class PersonStaticFactory {
    public static Person getInstance(String name) {
        Person person = new Person();
        person.setId(1);
        person.setName(name);
        person.setAge(18);
        return person;

    }
}
