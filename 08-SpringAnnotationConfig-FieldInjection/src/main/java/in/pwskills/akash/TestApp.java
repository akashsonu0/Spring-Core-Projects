package in.pwskills.akash;
import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.akash.beans.Flipkart;
import in.pwskills.akash.config.AppConfig;


public class TestApp {
	public static void main(String[] args) {
		
		//starting the container
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println();
		
		//Asking the container to give the Bean
		Flipkart flipkart = context.getBean("flipkart",Flipkart.class);
		System.out.println(flipkart.shopping(new String[] {"fossilwatch","lp belts","arrowshoes"}, 
						  new float[] {56700.5f,3500.5f,4500.50f}));
		
		
		//close the container
		((AbstractApplicationContext) context).close();

	}
}