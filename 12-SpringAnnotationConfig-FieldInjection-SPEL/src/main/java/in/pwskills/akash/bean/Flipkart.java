package in.pwskills.akash.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Flipkart {
	@Value("#{dtdc}")
	private ICourier courier;

	@Override
	public String toString() {
		return "Flipkart [courier=" + courier + "]";
	}
	
	
}
