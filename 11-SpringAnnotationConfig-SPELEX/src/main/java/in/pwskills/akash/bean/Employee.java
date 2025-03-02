package in.pwskills.akash.bean;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("application.properties")
public class Employee implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
	
		static {
			System.out.println("Employee.class file is loading..."); 
			
		}
		
		public Employee() {
			System.out.println("Employee Object created :: Zero param...");
		}
		
		//Expression language
		@Value("#{new java.util.Random().nextInt(1000)}")
		private Integer eid;
		
		@Value("${info.emp.ename}")
		private String ename;
		
		@Value("${info.emp.eage}")
		private Float eage;
		
		//collection variable
		@Value("#{'${info.emp.friends}'.split(' ,')}")
		private List<String> friends;
		
		@Value("${info.emp.phoneNumber}")
		private Set<String> phoneNumbers;
		
		@Value("#{${info.emp.accountNumber}}")
		private Map<String , String> accountNumbers;
		
		//Ternary operator
		@Value("#{10<20 ? 5000 : 3000}")
		private Float salary;
		
		//static method
		@Value("#{T(java.time.LocalDate).of(1993,1,3)}")
		private LocalDate dob;

		
		@Override
		public String toString() {
			return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", friends=" + friends
					+ ", phoneNumbers=" + phoneNumbers + ", accountNumbers=" + accountNumbers + ", salary=" + salary
					+ ", dob=" + dob + "]";
		}
		
		
		
		}
		
	

