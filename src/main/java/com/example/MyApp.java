package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MessageService messageService = applicationContext.getBean("messageService", MessageService.class);
        MessageService randomTextService = applicationContext.getBean("randomTextService", MessageService.class);

        System.out.println(messageService.getMessage());
        System.out.println(messageService.hashCode());
        System.out.println(randomTextService.hashCode());

        applicationContext.close();
    }
}