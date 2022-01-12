package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(messageServiceConfig.class) ;

        MessageService messageService = applicationContext.getBean(MyNameMessageService.class);
        MessageService randomTextService = applicationContext.getBean(RandomTextMessageService.class);

        System.out.println(messageService.getMessage());

    }
}
