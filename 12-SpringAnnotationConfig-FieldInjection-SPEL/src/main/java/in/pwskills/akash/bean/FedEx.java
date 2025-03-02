package in.pwskills.akash.bean;

import org.springframework.stereotype.Component;

@Component(value = "courier")
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
