package in.pwskills.akash;
import java.io.IOException;

import java.util.Date;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import in.pwskills.akash.config.AppConfig;

public class TestApp {
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) throws IOException {
		
		//starting the container
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
				
		System.out.println("Conatiners started at ::" +new Date());
		
		//close the container
		//((AbstractApplicationContext) context).close();

	}
}