import com.atjiepi.bean.aop.MathAop;
import com.atjiepi.bean.config.MyAopConfig;
import com.atjiepi.bean.service.TxUserService;
import com.atjiepi.bean.txConfig.TxConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TXTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TxConfig.class);

        TxUserService userService = applicationContext.getBean(TxUserService.class);
        userService.insert();

    }
}
