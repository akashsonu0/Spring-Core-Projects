package in.pwskills.akash.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		//primitive variable
		private int eid;
		private float salary;
		
		//collection variable
		private List<String> friends;
		private Set<String> phoneNumbers;
		private Map<String , String> accountNumbers;
		
		static {
			System.out.println("Employee.class file is loading..."); 
			
		}
		
		//constructor
		public Employee(int eid, float salary, List<String> friends, Set<String> phoneNumbers,
				Map<String, String> accountNumbers) {
			System.out.println("Employee :: Using param constructor...");
			this.eid = eid;
			this.salary = salary;
			this.friends = friends;
			this.phoneNumbers = phoneNumbers;
			this.accountNumbers = accountNumbers;
		}

		@Override
		public String toString() {
			return "Employee [eid=" + eid + ", salary=" + salary + ", friends=" + friends + ", phoneNumbers="
					+ phoneNumbers + ", accountNumbers=" + accountNumbers + "]";
		}
		
	}

