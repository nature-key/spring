import com.atjiepi.bean.Boss;
import com.atjiepi.bean.Car;
import com.atjiepi.bean.config.MyAutoConfig;
import com.atjiepi.bean.service.Service;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAuto {
    @Test
    public void  test(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyAutoConfig.class);
//        Service bean =(Service) annotationConfigApplicationContext.getBean("service");
//        System.out.println(bean);
////        Object personDao = annotationConfigApplicationContext.getBean("personDao");
//        System.out.println(bean.toString());
        System.out.println(annotationConfigApplicationContext);
        Boss bean1 = annotationConfigApplicationContext.getBean(Boss.class);
        System.out.println("boddddd===="+bean1);
        Car car = annotationConfigApplicationContext.getBean(Car.class);
        System.out.println("dfsafdsfasd"+car);
    }
}
