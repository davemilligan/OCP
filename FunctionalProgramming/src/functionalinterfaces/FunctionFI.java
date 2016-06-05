package functionalinterfaces;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionFI {

	public static void main(String[] args) {
		Function<String, LocalDate> dateParser = LocalDate::parse; 
		LocalDate d = dateParser.apply("1964-04-30");
		System.out.println(d);
		
		DateTimeFormatter patternFormatter = DateTimeFormatter.ofPattern("dd MM yyyy");
		BiFunction<String, DateTimeFormatter, LocalDate> parseDate2 = LocalDate::parse;
		LocalDate d2 = parseDate2.apply("30 04 1964", patternFormatter);
		System.out.println(d2);		
	}
}
