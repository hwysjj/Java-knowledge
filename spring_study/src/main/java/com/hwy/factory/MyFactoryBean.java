package com.hwy.factory;

import com.hwy.bean.Person;
import org.springframework.beans.factory.FactoryBean;

/**
 * 次方式是Spring创建bean方式的一种补充，用户可以自己按照需求创建对象，
 * 将创建的对象交给spting IOC容器进行管理，无论是否是单例，都是在用到的时候才会创建
 */
public class MyFactoryBean implements FactoryBean<Person> {
    /*
        返回获取的bean
    */
    @Override
    public Person getObject() throws Exception {
        Person person = new Person();
        person.setAge(12);
        person.setId(4);
        person.setName("Wangwu");
        return person;
    }
/*
获取返回bean的类型
 */
    @Override
    public Class<?> getObjectType() {
        return null;
    }
/*
判断当前类是否是单例的
 */
    @Override
    public boolean isSingleton() {
        return false;
    }
}
