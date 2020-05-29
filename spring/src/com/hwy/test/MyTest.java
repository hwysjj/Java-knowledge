package com.hwy.test;

import com.hwy.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
// 容器中person是什么时候创建的
// 容器中的对象在容器创建之前就已经把对象创建好了
public class MyTest {
    public static void main(String[] args) {
        /*
        *   applicationContext：表示IOC容器的入口，想要获取对象的话必须要创建该类
        *   该类有两个读取配置文件的实现类
        *   ClassPathXmlApplicationContext：表示从Classpath中读取数据
        *   FileSystemXmlApplicationContext：表示从当前文件系统读取数据
        *
        * */
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
//        获取具体的bean对象，需要强制类型转换
//        Person person = (Person) context.getBean("person");
        // 获取对象的时候不需要强制转换
        Person person1 = context.getBean("person", Person.class);
        System.out.println(person);
    }
}