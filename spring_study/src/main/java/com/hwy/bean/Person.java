package com.hwy.bean;

import java.util.*;

public class Person {
    private int id;
    private String name;
    private Integer age;
    private String gender;
    private Address address;
    private List<Address> lists;
    private Set<String> sets;
    private Map<String,Object> maps;
    private String[] hobbies;

    public String[] getHobbies() {
        return hobbies;
    }
    public void init() {
        System.out.println("对象初始化");
    }
    public void destroy() {
        System.out.println("对象初销毁");
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Address> getLists() {
        return lists;
    }

    public void setLists(List<Address> lists) {
        this.lists = lists;
    }

    public Set<String> getSets() {
        return sets;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    private Properties properties;

    public Person() {
        System.out.println("构建Person成功！");
    }

    public Person(int id, String name, Integer age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public Person(int id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address=" + address +
                ", lists=" + lists +
                ", sets=" + sets +
                ", maps=" + maps +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", properties=" + properties +
                '}';
    }
}
