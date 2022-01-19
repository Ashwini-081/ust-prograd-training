package Calculater.Demo.CalculaterSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.el.BeanNameResolver;



@SpringBootApplication
public class CalculaterSpringApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(CalculaterSpringApplication.class, args);
		CalculatorController calculatorController=context.getBean(CalculatorController.class);



	}




}



/*create a simple spring boot application and add a class to implement calculator functionalities.
 fetch the input required from application. properties file.use @component and @value annotation */