package in.pwskills.akash.config;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan(basePackages = "in.pwskills.akash")
@EnableScheduling

public class AppConfig {
	
	
 }

