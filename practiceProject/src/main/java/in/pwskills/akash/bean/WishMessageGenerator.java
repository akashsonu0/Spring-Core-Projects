package in.pwskills.akash.bean;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WishMessageGenerator {
	@Autowired
	private LocalDateTime date;
	
	public String WishMessage(String user) {
		int hour = date.getHour();
		String msg = "";
		if(hour<12) {
			msg +="GoodMorning :: "+user;
		}
		if(hour<16) {
			msg +="GoodAfternoon :: "+user;
		}
		if(hour<20) {
			msg +="GoodEvening :: "+user;
		}
		else {
			msg +="GoodNight :: "+user;
		}
		return msg;
	}

	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}
	

}
