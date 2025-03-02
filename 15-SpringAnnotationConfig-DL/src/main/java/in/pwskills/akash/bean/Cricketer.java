package in.pwskills.akash.bean;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public interface Cricketer {

	@Lookup
	public abstract CricketBat creatCricketBat();
	
	public default void fielding() {
		System.out.println("Crickter is doing fielding...");
	}
	
	public default void bowling() {
		System.out.println("Crickter is doing bowling...");
	}
	
	public default void wicketkeeping() {
		System.out.println("Crickter is doing wicketkkeeping...");
	}
	
	public default void batting() {
		System.out.println("Crickter.batting()");
		
		//Performing Dependency Lookup to get the CricketBat object
		CricketBat bat = creatCricketBat();
		int runs = bat.scoreRun();
		System.out.println("Cricketer is doing batting and his current score is ::"+ runs);
	}	
	
}
