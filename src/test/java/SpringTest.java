import com.atjiepi.bean.Person;
import com.atjiepi.bean.config.Config;
import com.atjiepi.bean.config.Config2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

public class SpringTest {


    @Test
    public void test01() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    @Test
    public void test02() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config2.class);
        System.out.println("容器创建完成");
        Person person = (Person) applicationContext.getBean("person");
//        Person person1 = (Person) applicationContext.getBean("person");
//
//        System.out.println(person == person1);
    }

    @Test
    public void test03() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config2.class);
        ConfigurableEnvironment environment = annotationConfigApplicationContext.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println(property);

        String[] beanNamesForType = annotationConfigApplicationContext.getBeanNamesForType(Person.class);
        for (int i = 0; i < beanNamesForType.length; i++) {
            System.out.println(beanNamesForType[i]);
        }
        Map<String, Person> beansOfType = annotationConfigApplicationContext.getBeansOfType(Person.class);

        System.out.println(beansOfType);
    }

    @Test
    public void test04() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config2.class);
        String[] names = annotationConfigApplicationContext.getBeanDefinitionNames();
//        for (int i = names.length - 1; i >= 0; i--) {
//            System.out.println(names[i]);
//        }
        for (String name : names) {
            System.out.println(name);
        }
    }
    @Test
    public  void test05(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config2.class);
        String[] names = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        Object factoryBean = annotationConfigApplicationContext.getBean("&factoryBean");
        System.out.println(factoryBean.getClass());

    }
}
