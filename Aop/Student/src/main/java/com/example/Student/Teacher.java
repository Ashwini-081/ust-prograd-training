package com.example.Student;

import org.springframework.stereotype.Component;

@Component
public class Teacher {
    public static void show(){
        System.out.println("i am in Teacher class");

    }
    public static void showdisplay(){
        System.out.println("showdisplay");
    }
    public static void displayshow(){
        System.out.println("displayshow");
    }
    public static void displayshow1(int a){
        System.out.println("displayshow111");
    }
    public static String returnValue(){
        System.out.println("Return value executed.");
        return "Return Value";
    }

    public static void throwException(){
        System.out.println(" throw exception executed.");
        throw new ArithmeticException("Arithmetic exception occures.");
    }

}
