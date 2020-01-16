package com.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
//        Helloworld helloworld=new Helloworld();
//        helloworld.setName("spring");
//        helloworld.hello();

        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-config.xml");
//        Helloworld helloworld1=(Helloworld) ctx.getBean("helloworld");
//        helloworld1.hello();
//            Car car=(Car)ctx.getBean(Car.class);
//            System.out.println(car.toString());
Person person=(Person)ctx.getBean("person");
System.out.println(person.toString());

    }
}
