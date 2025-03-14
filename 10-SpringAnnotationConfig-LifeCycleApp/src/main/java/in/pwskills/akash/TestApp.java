package in.pwskills.akash;

import org.springframework.context.ApplicationContext;




import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.akash.bean.VoterVerifier;
import in.pwskills.akash.config.AppConfig;

public class TestApp {
	public static void main(String[] args) {
		
		System.out.println("********starting the conatiner********");
		//starting the container
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println("*****************************");
		
		String[]names = context.getBeanDefinitionNames();
		for(String beanName : names) {
			System.out.println(beanName);
		}
		
		//Working with bean created by IOC
		VoterVerifier bean = context.getBean("voter",VoterVerifier.class);
		String status = bean.checkVotingEligibility();
		System.out.println(status);
		//close the container
		((AbstractApplicationContext) context).close();
		System.out.println("********Closing the container********");
	}
}