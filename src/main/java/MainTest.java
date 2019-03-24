

import com.atjiepi.bean.Person;
import com.atjiepi.bean.config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class MainTest {


    public static void main(String[] args) {

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
////        Person person = applicationContext.getBean("person");
////        System.out.printf(person.toString());
//       Person person =(Person) applicationContext.getBean("person");
//        System.out.printf(person.toString());

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        Person person = applicationContext.getBean(Person.class);
        System.out.printf(person.toString());
        String[] name = applicationContext.getBeanNamesForType(Person.class);
//        List<String> list = new ArrayList<String>();
        for (int i = name.length - 1; i >= 0; i--) {
            System.out.printf(name[i]);
        }
    }


}
