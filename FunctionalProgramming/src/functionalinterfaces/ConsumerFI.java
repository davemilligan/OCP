package functionalinterfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerFI {

	public static void main(String[] args) {
		Consumer<String> printString = System.out::println;
		printString.accept("Drivel");
		//printString.accept(500);  // the Consumer points to the String overload, no other.
		
		Map<String, Integer> hashMap = new HashMap<>();
		BiConsumer<String, Integer> mapPut = hashMap::put;
		mapPut.accept("Key", 500);
		System.out.println(hashMap);
		
		System.out.println(mapPut);
	}

}
