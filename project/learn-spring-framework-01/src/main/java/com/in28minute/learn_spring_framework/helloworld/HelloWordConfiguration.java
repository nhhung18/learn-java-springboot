package com.in28minute.learn_spring_framework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age){

}

@Configuration
public class HelloWordConfiguration {
    @Bean
    public String name(){
        return "Huy Hung";
    }

    @Bean
    public int age(){
            return 20;
    }

    @Bean
    public Person person(){
        return new Person("Jack",36);
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age());
    }
}
