package com.example.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
        Student fred = context.getBean("student", Student.class);
        fred.displayStudentInfo();

        Student student2 = context.getBean("student2", Student.class);
        student2.displayStudentInfo();
    }
}
