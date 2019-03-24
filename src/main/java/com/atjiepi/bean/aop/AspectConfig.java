package com.atjiepi.bean.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AspectConfig {

    @Pointcut("execution(public int com.atjiepi.bean.aop.MathAop.*(..))")
    public  void poinCut(){

    }

    @Before("poinCut()")
    public void logStart(JoinPoint joinPoint) {
        System.out.println("start"+joinPoint.getSignature().getName());
    }

    @After("poinCut()")
    public void logEnd(JoinPoint joinPoint) {
        System.out.println("end"+joinPoint.getSignature().getName());
    }

//    @AfterReturning("execution(public int com.atjiepi.bean.aop.MathAop.dev(int ,int))")
    @AfterReturning(value = "poinCut()",returning = "result")
    public void logReturn(JoinPoint joinPoint,Object result) {
        System.out.println("return"+result);
    }

    @AfterThrowing(value = "poinCut()",throwing = "exception")
    public void logException(JoinPoint joinPoint,Exception exception) {
        System.out.println("exception"+exception);
    }
}
