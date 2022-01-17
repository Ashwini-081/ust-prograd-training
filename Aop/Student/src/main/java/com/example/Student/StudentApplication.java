package com.example.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@SpringBootApplication
@EnableAspectJAutoProxy
public class StudentApplication {

	public static void main(String[] args) {
		
		ApplicationContext context=SpringApplication.run(StudentApplication.class, args);
		Student student=context.getBean(Student.class);
		student.show();

	}

}
