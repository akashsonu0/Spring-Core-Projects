package in.pwskills.akash;


import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.akash.bean.Employee;
import in.pwskills.akash.config.AppConfig;

public class TextApp {

	public static void main(String[] args) {

		//starting the container
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee employee = context.getBean(Employee.class);
		System.out.println(employee);
		((AbstractApplicationContext) context).close();
	}

}
