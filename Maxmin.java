package Java8;

public class Maxmin {
	public int max(int[] num) {
		int max=num[0];
		for(int n:num) {
			if(n>=max) {
				max=n;
			}
		}
		return max;
	}
	public int min(int[] num) {
		int min=num[0];
		for(int n:num) {
			if(n<=min) {
				min=n;
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		int[] num= {1,2,3,4,5};
		Maxmin m=new Maxmin();
		System.out.println(m.max(num));
		System.out.println(m.min(num));
	}
}
