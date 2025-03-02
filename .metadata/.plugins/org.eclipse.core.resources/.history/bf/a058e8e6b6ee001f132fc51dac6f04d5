package in.pwskills.akash;
import java.io.IOException;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.akash.bean.Flipkart;
import in.pwskills.akash.bean.ICourier;
import in.pwskills.akash.config.AppConfig;

public class TestApp {
	public static void main(String[] args) throws IOException {
		
		//starting the container
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
				
		Flipkart f1 = context.getBean("flipkart",Flipkart.class);
		ICourier courier1 = f1.getCourier();
		System.out.println("courier :: " + courier1);
		System.out.println(f1);
		
		System.in.read();
		
		Flipkart f2 = context.getBean("flipkart",Flipkart.class);
		ICourier courier2 = f2.getCourier();
		System.out.println( "courier :: " + courier2);
		System.out.println(f2);
		
		//close the container
		((AbstractApplicationContext) context).close();

	}
}