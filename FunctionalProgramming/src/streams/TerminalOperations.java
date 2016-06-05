package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		List<String> wordList = new ArrayList<>(Arrays.asList("H", "e", "l", "l", "o"));
		
		boolean allEven = intList.stream().allMatch(n -> (n % 2 == 0));
		System.out.println(allEven);
		
		boolean anyEven = intList.stream().anyMatch(n -> (n % 2 == 0));
		System.out.println(anyEven);
		
		//  Returns true if no elements match
		boolean noneEven = intList.stream().noneMatch(n -> (n % 2 == 0));
		System.out.println(noneEven);
		
		long count = intList.stream().count();
		System.out.println(count);
		
		//  max/min return Optional
		System.out.println(intList.stream().max((a,b) -> (a < b) ? -1 : (a > b)? 1 : 0));
		System.out.println(intList.stream().min((a,b) -> (a < b) ? -1 : ( a> b)? 1 : 0));
		//  Optional allows an empty stream to be tested.
		Optional<?> isEmpty = Stream.empty().min((a,b) -> 0);
		System.out.println(isEmpty);
		
		//  Remembering that some terminators return optional we can do this.
		intList.stream().findFirst().ifPresent(System.out::println);
		intList.stream().findAny().ifPresent(System.out::println);
		//  This stops an infinite stream.
		System.out.println(Stream.iterate(1, n -> n + 2).findAny());
		
		//  we can print on a conditional, note foreach has void return type.
		intList.stream().forEach(n -> {
			if (n % 2 == 0)
				System.out.println(n);
		});
		
		Integer total = intList.stream().reduce(0, (a, b) -> a + b);
		System.out.println(total);
		
		String word = wordList.stream().reduce("", String::concat);
		System.out.println(word);
		//  Dont define a identity and an Optional is returned.
		Optional<String> optWord = wordList.stream().reduce(String::concat);
		System.out.println(optWord);
		// or
		optWord.ifPresent(System.out::println);
		
		//  Can do reduce in parallel.
		BinaryOperator<Integer> parallelBOP = (a, b) -> a + b;
		total = intList.stream().reduce(0, parallelBOP, parallelBOP);
		System.out.println(total);
		
		StringBuilder sb = wordList.stream().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
		System.out.println(sb);
		
		//  Note here when using the TreeSet we do not have duplicates.
		TreeSet<String> ts = wordList.stream().collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
		System.out.println(ts);
		
		TreeSet<String> ts2 = wordList.stream().collect(Collectors.toCollection(TreeSet::new));
		System.out.println(ts2);
		
		//  Will do it but unsorted
		Set<String> ts3 = wordList.stream().collect(Collectors.toSet());
		System.out.println(ts3);
		
		
		
	}
}
