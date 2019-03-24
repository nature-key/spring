import com.atjiepi.bean.config.MyProValue;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertyTest {

    AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyProValue.class);

    @Test
    public void test() {
        String[] names = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }
        Object person = annotationConfigApplicationContext.getBean("person");
        System.out.println(person);
    }
}
