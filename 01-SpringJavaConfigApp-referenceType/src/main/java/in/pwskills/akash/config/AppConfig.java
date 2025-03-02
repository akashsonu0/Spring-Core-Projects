package in.pwskills.akash.config;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import in.pwskills.akash.bean.Employee;

@Configuration
public class AppConfig {
	static {
		System.out.println("AppConfig.class file is loading...");
	}

	public AppConfig() {
		System.out.println("AppConfig object is created...");
	}

	@Bean(name = "emp")
	public Employee empObj() {
		System.out.println("AppConfig.empObj():: Creating the object...");
		
		//Created object using zero PARAM constructor
		Employee employee = new Employee();
		
		//injecting values through setters
		employee.setEid(10);
		employee.setEname("sachin");
		employee.setEage(52);
		employee.setEaddress("MI");
		return employee;
	}

}
