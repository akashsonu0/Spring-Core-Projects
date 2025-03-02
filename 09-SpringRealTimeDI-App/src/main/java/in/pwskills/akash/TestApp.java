package in.pwskills.akash;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.pwskills.akash.bean.CustomerVo;
import in.pwskills.akash.config.AppConfig;
import in.pwskills.akash.controller.CustomerController;


public class TestApp {
	public static void main(String[] args) {
		
		//starting the container
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//Reading inputs from the user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the coustomerName:: ");
		String name = scanner.next();
		
		System.out.println("Enter the coustomerAddress:: ");
		String address = scanner.next();
		
		System.out.println("Enter the Principal Amount:: ");
		String pamt = scanner.next();
		
		System.out.println("Enter the interest:: ");
		String rate = scanner.next();
		
		System.out.println("Enter the time period:: ");
		String time = scanner.next();
		
		
		try {
			CustomerVo vo = new CustomerVo();
			vo.setCustAddr(address);
			vo.setCustName(name);
			vo.setPamt(pamt);
			vo.setRate(rate);
			vo.setTime(time);
			
			CustomerController controller = context.getBean("controller",CustomerController.class);
			String status = controller.processCustomer(vo);
			System.out.println(status);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Some internal problem occured ---> Try again :: " + e.getMessage());
		}
		
		//close the container
		((AbstractApplicationContext) context).close();
		scanner.close();
	}
}