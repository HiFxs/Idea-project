package com.spring.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component("logginAspect")
@Aspect
public class LogginAspectJ {
    @Pointcut("execution(* com.spring.aop.Arithmetic.*(..))")
    public void PointcutDeclaration() {}

    //前置通知,方法执行之前执行
    @Before("PointcutDeclaration()")
    public void BeforeMethod(JoinPoint jp) {
        String methodName = jp.getSignature().getName();
        Object[] args = jp.getArgs();
        System.out.println("BeforeMethod  The method   "+ methodName +"   parameter is  "+ Arrays.asList(args));
        System.out.println("add before");
        System.out.println();
    }

    //后置通知,方法执行之后执行(不管是否发生异常)
    @After("PointcutDeclaration()")
    public void AfterMethod(JoinPoint jp) {
        String methodName = jp.getSignature().getName();
        Object[] args = jp.getArgs();
        System.out.println("AfterMethod  The method    "+ methodName +"   parameter is  "+Arrays.asList(args));
        System.out.println();
    }

    @AfterReturning(value="PointcutDeclaration()",returning="result")
    public void AfterReturningMethod(JoinPoint jp,Object result) {
        String methodName = jp.getSignature().getName();
        Object[] args = jp.getArgs();
        System.out.println("AfterReturningMethod  The method   "+ methodName +"   parameter is  "+ Arrays.asList(args)+" "+result);
        System.out.println();
    }

    //异常通知,在方法抛出异常之后执行
    @AfterThrowing(value="PointcutDeclaration()",throwing="e")
    public void AfterThrowingMethod(JoinPoint jp,Exception e) {
        String methodName = jp.getSignature().getName();
        System.out.println("AfterThrowingMethod  The method   "+ methodName +"exception :"+e);
    }






}
