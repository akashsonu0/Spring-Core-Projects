package in.pwskills.akash.bean;
import java.util.Date;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ReportGenerator {
	
	@Scheduled(cron =" 15 * * * * * " )
	public void generateSalesReport() {
		
		try {
			Thread.sleep(5000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//batch processing code U can write here
		System.out.println("Sales Report on ::" + new Date());
	}

}
