package com.malhi.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;


public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("content.xml");
        Guest guest = context.getBean(Guest.class);
        GuestBookService service = context.getBean(GuestBookService.class);
        service.addguest(guest);
       service.printGuest();

    }

}
