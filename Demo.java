package Java8;

import java.util.Optional;

public class Demo {
	public static void main(String[] args) {
		String x=null;
	
	Optional<String> y=Optional.ofNullable(x);
	if(y.isPresent()) {
		System.out.println(x.toUpperCase());
	}
	else {
		System.out.println("Value not present");
	}

}}
