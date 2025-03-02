package in.pwskills.akash.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DTDC implements ICourier {

	@Override
	public String deliverOrder(Integer oid) {
		
		return null;
	}

	@Override
	public String toString() {
		return "DTDC []";
	}
	
	
}
