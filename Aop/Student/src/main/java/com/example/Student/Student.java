package com.example.Student;

import org.springframework.stereotype.Component;

@Component
public class Student {
    public void show(){
        System.out.println("I am in Student class");
        Teacher.show();
        Teacher.showdisplay();
        Teacher.displayshow();
        Teacher.displayshow1(5);
        Teacher.returnValue();
        Teacher.throwException();
    }

}
