package in.pwskills.akash.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;


import org.springframework.context.annotation.Configuration;

import in.pwskills.akash.bean.WishMessageGenerator;



@Configuration
public class AppConfig {
	static {
		System.out.println("AppConfig.class file is loading...");
	}

	public AppConfig() {
		System.out.println("AppConfig object is created...");
	}

	@Bean(name = "wmg")
	public WishMessageGenerator wmg() {
		System.out.println("AppConfig.wmg():: Creating the object...");
		
		//Create a Target Object
		WishMessageGenerator generator = new WishMessageGenerator();
		
		//create the Object using setter style
		LocalDateTime ldt = LocalDateTime.now();
		
		//linking the object using setter style
		generator.setLdt(ldt);
		
		return generator;
	}

}
