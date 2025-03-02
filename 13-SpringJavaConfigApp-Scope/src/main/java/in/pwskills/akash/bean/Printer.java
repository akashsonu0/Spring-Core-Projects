package in.pwskills.akash.bean;

public class Printer {
	
	static {
		System.out.println("Printer.class file is loading...");
	}
	
	private static Printer INSTANCE = null;
	
	public static Printer getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Printer();
		}
		return INSTANCE;
	}
	private Printer() {
		System.out.println("Prinetr Object is created...");
	}
	

}
