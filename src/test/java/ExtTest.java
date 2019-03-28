import com.atjiepi.bean.aop.MathAop;
import com.atjiepi.bean.config.MyAopConfig;
import com.atjiepi.bean.ext.MyExtConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExtTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyExtConfig.class);
        applicationContext.close();

    }
}
