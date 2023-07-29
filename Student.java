package Java8;

public interface Student {
	public static String name() {
		return "Suresh";
		
	}
	public default int age(int year) {
		return 2023-year;
	}
	public String degree(String d);
	

}


