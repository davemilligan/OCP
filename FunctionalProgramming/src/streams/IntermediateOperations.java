package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperations {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
		List<String> wordList = new ArrayList<>(Arrays.asList("H", "e", "l", "l", "o"));

		List<Integer> allEven = intList.stream().filter(n -> (n % 2 == 0)).collect(Collectors.toList());
		System.out.println(allEven);

		List<String> deduped = wordList.stream().distinct().collect(Collectors.toList());
		System.out.println(deduped);

		List<Integer> limitedIntList = intList.stream().limit(4).collect(Collectors.toList());
		System.out.println(limitedIntList);

		List<Integer> skipIntList = intList.stream().skip(4).collect(Collectors.toList());
		System.out.println(skipIntList);

		List<Integer> mapIntList = intList.stream().map(n -> n * n).collect(Collectors.toList());
		System.out.println(mapIntList);

		// Again printing from the stream.
		intList.stream().map(n -> n * n).forEach(System.out::println);

		// Combine streams into one top level stream.
		List<String> one = Arrays.asList("Dave Dee", "Dozy", "Mick", "Titch");
		List<String> two = Arrays.asList("John", "Paul", "George", "Ringo");
		List<String> three = new ArrayList<>();
		Stream<List<String>> flatMapper = Stream.of(three, two, one);
		flatMapper.flatMap(arr -> arr.stream()).forEach(System.out::println);

		flatMapper = Stream.of(three, two, one);
		flatMapper.flatMap(arr -> arr.stream()).sorted().forEach(System.out::println);

		flatMapper = Stream.of(three, two, one);
		flatMapper.flatMap(arr -> arr.stream()).sorted(Comparator.reverseOrder()).forEach(System.out::println);

		skipIntList = intList.stream().peek(System.out::print).skip(4).collect(Collectors.toList());
		System.out.println(skipIntList);

		List<String> filtered = new ArrayList<>();
		one.stream()
			.filter(s -> s.length() == 4)
			.sorted()
			.limit(2)
			.forEach(filtered::add);
		System.out.println(filtered);

	}
}
