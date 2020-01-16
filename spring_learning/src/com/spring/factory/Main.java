package com.spring.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//采用静态工厂方法对bean实例化操作
//在bean配置中需要注意是，bean中需要声明静态工厂的类名，以及静态工厂的静态方法名
//其次用constract-agu将需要的参数标签属性传入静态工厂方法中去，完成一个用静态工厂方法对一个bean进行实例化的操作。
public class Main {


    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-facotry.xml");
//        Car car=(Car) ctx.getBean("car1");
//        System.out.println(car);
    Car car2=(Car)ctx.getBean("car2");
        System.out.println(car2);


    }
}
