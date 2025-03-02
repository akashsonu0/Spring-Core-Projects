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
		
		//Asking the container to give bean
		WishMessageGenerator generator = context.getBean("wmg",WishMessageGenerator.class);
		String status = generator.wishMessage("akashsonu");

		System.out.println(status);
		
		//close the container
		((AbstractApplicationContext) context).close();

	}
}