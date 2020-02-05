package com.spring.aop;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
Arithmetic arithmetic=(Arithmetic) context.getBean("arithmetic");
int result=arithmetic.add(1,2);
        System.out.println("result:"+result);
        System.out.println("---------------");
        result=arithmetic.div(8,1);
        System.out.println("result:"+result);

    }



}
