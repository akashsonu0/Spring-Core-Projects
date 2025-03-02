package in.pwskills.akash;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.akash.bean.Employee;
import in.pwskills.akash.config.AppConfig;

public class TestApp {
	public static void main(String[] args) {
		
		System.out.println("********starting the conatiner********");
		//starting the container
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Employee employee = context.getBean("employee",Employee.class);
		System.out.println(employee);
		//close the container
		((AbstractApplicationContext) context).close();
		
	}
}