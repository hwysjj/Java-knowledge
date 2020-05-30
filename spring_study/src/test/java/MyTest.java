import com.hwy.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        Person person = context.getBean("person", Person.class);
        Person person2 = context.getBean("person2", Person.class);
        Person person3 = context.getBean("person3", Person.class);
        Person person4 = context.getBean("person4", Person.class);
        Person person5 = context.getBean("person5", Person.class);
        Person person6 = context.getBean("person6", Person.class);
        System.out.println(person);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);
        Person son = context.getBean("son", Person.class);
    }
}
