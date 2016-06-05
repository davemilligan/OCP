package functionalinterfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorFI {

	public static void main(String[]args) {
		//  Same as BiFunction<String, String, String>
		BinaryOperator<String> cc = String::concat; 
		String concated = cc.apply("dave", "milligan");
		System.out.println(concated);
	}

}
