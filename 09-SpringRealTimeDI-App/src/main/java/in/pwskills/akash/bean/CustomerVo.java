package in.pwskills.akash.bean;

public class CustomerVo {

	private String custName;
	private String custAddr;
	private String pamt;
	private String rate;
	private String time;
	
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddr() {
		return custAddr;
	}
	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}
	public String getPamt() {
		return pamt;
	}
	public void setPamt(String pamt) {
		this.pamt = pamt;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "CustomerVo [custName=" + custName + ", custAddr=" + custAddr + ", pamt=" + pamt + ", rate=" + rate
				+ ", time=" + time + "]";
	}
	
	
}
