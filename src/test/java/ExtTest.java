import com.atjiepi.bean.aop.MathAop;
import com.atjiepi.bean.config.MyAopConfig;
import com.atjiepi.bean.ext.MyExtConfig;
import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExtTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyExtConfig.class);
        applicationContext.publishEvent(new ApplicationEvent(new String()) {
            @Override
            public Object getSource() {
                return super.getSource();
            }
        });
        applicationContext.close();

    }
}
