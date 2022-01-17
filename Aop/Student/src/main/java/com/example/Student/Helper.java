package com.example.Student;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Helper {
    @Before("execution(public void show())")
    public void log(){

        System.out.println("print during method execution");
    }
    @After("execution(public void show())")
    public void log1(){
        System.out.println("");
    }
    @Pointcut("execution(public void *show*())")
    public void pointcut(){}

//    @Before("pointcut()")
//    public void beforelog(){
//        System.out.println("Before function execution");
//    }
//
//    @After("pointcut()")
//    public void afterlog(){
//        System.out.println("After function execution");
//    }
    @Around("pointcut()")
    public void aroundlog(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
        System.out.println("Before");
        proceedingJoinPoint.proceed();
        System.out.println("After");

    }


}
