package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {

	public static void main(String[] args) {
		processFiniteStream();
		streamsFromList();
		createInfiniteStream();
	}
	
	private static void createInfiniteStream() {
		//  Note that this is not executed till the stream terminator is called.
		Stream<Double> randoms = Stream.generate(Math::random);
		processStream(randoms, 15);		
		
		Stream<Integer> odds = Stream.iterate(1, n -> n + 2);
		processStream(odds, 15);
	}

	public static void streamsFromList() {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		Stream<Integer> intStream = list.stream();
		System.out.println(intStream);
		processStream(intStream);
		Stream<Integer> parallelntStream = list.parallelStream();
		System.out.println(parallelntStream);
		processStream(parallelntStream);
		System.out.println("Note indeterminate order");
	}
	
	/**
	 * 
	 */
	public static void processFiniteStream() {
		Stream<String> empty = Stream.empty();
		processStream(empty);
		
		Stream<String> notEmpty = Stream.of("This", "is",  "a", "stream");
		processStream(notEmpty);
		
		Stream<Integer> intStream = Stream.of(1,2,3,4,5,6,7);
		processStream(intStream);

	}
	
	public static void processStream(Stream<? extends Object> stream) {
		stream.forEach(i -> System.out.print(i + " "));
		System.out.println();
	}
	

	private static void processStream(Stream<? extends Object> stream, int max) {
		stream.limit(max).forEach(i -> System.out.print(i + " "));
		System.out.println();	
	}

}
