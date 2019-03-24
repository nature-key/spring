import com.atjiepi.bean.aop.MathAop;
import com.atjiepi.bean.config.MyAopConfig;
import com.atjiepi.bean.config.MyConfigDataSource;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyAopConfig.class);
        MathAop bean = applicationContext.getBean(MathAop.class);
        try {
            bean.dev(1,0);
        }catch (Exception err){
            System.out.println(err.getMessage());
        }


    }
}
