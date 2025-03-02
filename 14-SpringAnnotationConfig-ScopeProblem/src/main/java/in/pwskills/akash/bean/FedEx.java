package in.pwskills.akash.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("fedex")
@Scope("prototype")

public class FedEx implements ICourier {

	@Override
	public String deliverOrder(Integer oid) {
		
		return null;
	}

	@Override
	public String toString() {
		return "FedEx []";
	}

	
}
