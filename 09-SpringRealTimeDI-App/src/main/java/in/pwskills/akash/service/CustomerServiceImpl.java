package in.pwskills.akash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.pwskills.akash.bean.CustomerBO;
import in.pwskills.akash.bean.CustomerDTO;
import in.pwskills.akash.dao.ICustomerDao;

@Component("service")
public final class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	private ICustomerDao dao;
	
    @Override
	public String calculateSimpleInterset(CustomerDTO dto) throws Exception {
    	
    	//calculate simple-interset for the given DTO object
    	float si = (dto.getPamt()*dto.getTime()*dto.getRate())/100;
    	
    	//Create a business object from DTO
    	CustomerBO bo = new CustomerBO();
    	bo.setCustAddr(dto.getCustAddr());
    	bo.setCustName(dto.getCustName());
    	bo.setPamt(dto.getPamt());
    	bo.setRate(dto.getRate());
    	bo.setTime(dto.getTime());
    	
    	//injecting simple-interset amount for BO
    	bo.setInterestAmount(si);
    	
    	int count = dao.insert(bo);
    
    	return count == 1 ? "Customer registered succesfuly with the interest amount :: " +si 
    	: "customer registration failed";
	}

}
