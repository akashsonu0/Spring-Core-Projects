package in.pwskills.akash;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.akash.bean.Employee;
import in.pwskills.akash.config.AppConfig;

public class TestApp {
	public static void main(String[] args) {
		
		//starting the container
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//Ask the container to give the bean with the id as specified
		Employee employee = context.getBean("emp", Employee.class);
		System.out.println(employee);
		
		//close the container
		((AbstractApplicationContext) context).close();

	}
}