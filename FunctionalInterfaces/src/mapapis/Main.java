package mapapis;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Main {

	public static void main(String[] args) {
		BiFunction<String, String, String> replaceIfLonger = (v1, v2) -> {
			return (v1.length() > v2.length() ? v1 : v2);
		};
		Map<String, String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Tom", "Train ride");
		System.out.println(favorites); 
		//Compares the value held for key "Jenny" with value "Trip to the moon"
		// and returns the longer of the current value and the given value.
		String jennyMapping = favorites.merge("Jenny", "Trip to the moon", replaceIfLonger);
		String tomMapping = favorites.merge("Tom", "Trip down memory lane", replaceIfLonger);
		System.out.println(jennyMapping);
		System.out.println(tomMapping);
		System.out.println(favorites);
	}

}
