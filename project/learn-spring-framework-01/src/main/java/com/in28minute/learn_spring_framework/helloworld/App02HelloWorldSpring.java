package com.in28minute.learn_spring_framework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
//    1. Launch a Spring context
        try (var context =
                     new AnnotationConfigApplicationContext(HelloWordConfiguration.class)) {
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));

            System.out.println(context.getBean("person"));

            System.out.println(context.getBean("person2MethodCall"));
        }

//    2. Config the things that we want Spring to manage - @Confiugration


//        System.out.println(context.getBean("name"));
//        System.out.println(context.getBean("age"));
//
//        System.out.println(context.getBean("person"));
//
//        System.out.println(context.getBean("person2MethodCall"));

    }
}
