package com.spring.annotation;

import com.spring.annotation.Controller.Usercontroller;
import com.spring.annotation.UserRepository.UserRepository;
import com.spring.annotation.service.Userservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-annotation.xml");
        TeatObject to=(TeatObject) ctx.getBean("teatObject");
        System.out.println(to);

        Usercontroller usercontroller=(Usercontroller)ctx.getBean("usercontroller");
        System.out.println(usercontroller);

        Userservice userservice=(Userservice) ctx.getBean("userservice");
        System.out.println(userservice);

        UserRepository userRepository=(UserRepository) ctx.getBean("userRepository");
        System.out.println(userRepository);



    }
}
