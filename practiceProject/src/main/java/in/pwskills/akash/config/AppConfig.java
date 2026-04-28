package in.pwskills.akash.config;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import in.pwskills.akash.bean.Employee;


@Configuration
@ComponentScan(basePackages="in.pwskills.akash")
public class AppConfig {
	static {
		System.out.println("AppConfig.class is created...");
	}
	public AppConfig() {
		System.out.println("AppConfig object is created...");
	}
		
	
	
}
