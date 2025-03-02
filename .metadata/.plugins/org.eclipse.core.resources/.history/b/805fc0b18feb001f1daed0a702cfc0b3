package in.pwskills.akash.bean;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//UserDefined type
@Component(value = "wmg")
public class WishMessageGenerator {
	
	static {
		System.out.println("WishMessageGenerator.class file is loading...");
	}
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator Object created using zero param...");
		
	}

	//HAS-A[Inbuilt type]
	@Autowired
	private LocalDateTime date;
	

	//Business logic
	public String wishMessage(String user) {
		System.out.println("WishMessageGenerator.wishMessage()");
		int hour = date.getHour();
		String msg ="";
		if(hour < 12) {
			msg +="Good Morning ::"+user;
		}else if(hour < 16){
			msg +="Good Afternoon ::"+user;
		}else if(hour < 20) {
			msg +="Good Evening ::"+user;
		}else {
			msg +="Good Night ::"+user;
		}
		return msg;
	}

	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}
	
}
