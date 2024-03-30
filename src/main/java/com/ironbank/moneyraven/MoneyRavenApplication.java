package com.ironbank.moneyraven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MoneyRavenApplication {
    public static void main(String[] args) {
        SpringApplication.run(MoneyRavenApplication.class, args);
    }
}


        /*
        //Посчитаем, сколько у нас тут бинов
        String[] names =
                SpringApplication.run(MoneyRavenApplication.class, args).getBeanDefinitionNames();
        int i=0;
        for (String name : names) {
            System.out.println(i++ + name);
        }*/