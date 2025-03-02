package in.pwskills.akash.bean;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("bat")
public class CricketBat {
	
	static {
		System.out.println("CricketBat.class file is loading..");
	}
	
	public CricketBat() {
		System.out.println("CricketBat Object is created...");
	}
	
	//BL
	public int scoreRun() {
		System.out.println("CricketBat.scoreRun()");
		return new Random().nextInt(200);
	}
}
