package com.example.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        //SpringApplication.run(DependencyInjectionApplication.class, args);
        ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");

        Student fred = context.getBean("fred", Student.class);
        fred.displayStudentInfo();
        fred.feedYourPet();


        Student student2 = context.getBean("student2", Student.class);
        student2.displayStudentInfo();
        student2.feedYourPet();

        Student student3 = context.getBean("student3", Student.class);
        student3.displayStudentInfo();
        student3.feedYourPet();
        System.out.println("I attend " + student3.getUniversity().getName());

    }

}
