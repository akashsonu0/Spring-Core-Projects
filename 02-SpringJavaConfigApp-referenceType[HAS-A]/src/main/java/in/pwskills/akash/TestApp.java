package in.pwskills.akash;

import org.springframework.context.ApplicationContext;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.akash.bean.WishMessageGenerator;
import in.pwskills.akash.config.AppConfig;

public class TestApp {
	public static void main(String[] args) {
		
		//starting the container
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//Working with Bean created by IOC
		WishMessageGenerator wmg = context.getBean("wmg",WishMessageGenerator.class);
		System.out.println(wmg);
		String status = wmg.wishMessage("sachin");
		System.out.println(status);
		
		//close the container
		((AbstractApplicationContext) context).close();

	}
}