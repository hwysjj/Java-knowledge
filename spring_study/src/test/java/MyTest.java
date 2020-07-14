import com.alibaba.druid.pool.DruidDataSource;
import com.hwy.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class MyTest {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
//        Person person = context.getBean("person", Person.class);
//        Person person2 = context.getBean("person2", Person.class);
//        Person person3 = context.getBean("person3", Person.class);
//        Person person4 = context.getBean("person4", Person.class);
//        Person person5 = context.getBean("person5", Person.class);
//        Person person6 = context.getBean("person6", Person.class);
//        System.out.println(person);
//        System.out.println(person2);
//        System.out.println(person3);
//        System.out.println(person4);
//        System.out.println(person5);
//        System.out.println(person6);
//        Person son = context.getBean("son", Person.class);

//        Person person9 = context.getBean("person9", Person.class);
//        System.out.println(person9);
//        Person person10 = context.getBean("person10", Person.class);
//        System.out.println(person10);
//        Person myFactoryBean = context.getBean("myFactoryBean", Person.class);
//        System.out.println(myFactoryBean);
//        Person person11 = context.getBean("person11", Person.class);
//        System.out.println(person11);
//        ((ClassPathXmlApplicationContext)context).close();

//        DruidDataSource dataSource = context.getBean("dataSource", DruidDataSource.class);
//        System.out.println(dataSource);
//        System.out.println(dataSource.getConnection());
//        DruidDataSource dataSource = context.getBean("dataSource2", DruidDataSource.class);
//        System.out.println(dataSource);
//        System.out.println(dataSource.getConnection());

//        Person person13 = context.getBean("person13", Person.class);
//        System.out.println(person13);
        Person person15 = context.getBean("person15", Person.class);
        System.out.println(person15);



    }
}
