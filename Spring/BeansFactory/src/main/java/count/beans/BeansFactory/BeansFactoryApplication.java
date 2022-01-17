package count.beans.BeansFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class BeansFactoryApplication implements CommandLineRunner {
	@Autowired
	private ApplicationContext appContext;
	public static void main(String[] args) throws Exception {
		SpringApplication.run(BeansFactoryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String[] beans = appContext.getBeanDefinitionNames();
		Arrays.sort(beans);
		for (String bean : beans) {
			System.out.println(bean);
			}

		}

	}



/*Create a simple spring boot application using spring initializer and display the count of beans
defined in the factory and to display the name of all the beans in the factory
 */