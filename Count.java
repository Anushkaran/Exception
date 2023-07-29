package Java8;

public class Count {
	static int c=0;
	public Count() {
		c++;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Count c1=new Count();
		Count c2=new Count();
		Count c3=new Count();
		
	}

}
