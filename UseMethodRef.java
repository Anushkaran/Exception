package Java8;


//MethodReference
public class UseMethodRef {
	public static void main(String[] args) {
		Maxmin mm=new Maxmin();
		int[] num= {10,20,30,40,50};
		MethodRef m=mm::max;
		System.out.println(m.math(num));
		MethodRef n=mm::min;
		System.out.println(n.math(num));
	}

}
