package functionalinterfaces;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class UnaryOperatorFI {
	public static void main(String[]args) {
		//  Same as Function<String, String>
		UnaryOperator<String> toUpper = String::toUpperCase; 
		String upper = toUpper.apply("dave");
		System.out.println(upper);
	}
}
