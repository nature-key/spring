import com.atjiepi.bean.config.Config3;
import com.atjiepi.bean.config.MyConfigDataSource;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class IocTest {

    @Test
    //-Dspring.profiles.active=test
    public void test() {
//        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfigDataSource.class);
//
//
//        String[] names = annotationConfigApplicationContext.getBeanDefinitionNames();
//        for (int i = names.length - 1; i >= 0; i--) {
//            System.out.println(names[i].toString());
////            Object bean =  annotationConfigApplicationContext.getBean(names[i]);
////            System.out.println(bean);
//        }


        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.getEnvironment().setActiveProfiles("test","dev");
        applicationContext.register(MyConfigDataSource.class);
        applicationContext.refresh();
        String[] names = applicationContext.getBeanDefinitionNames();
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i].toString());
//            Object bean =  annotationConfigApplicationContext.getBean(names[i]);
//            System.out.println(bean);
        }
    }
}
