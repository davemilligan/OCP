package wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperBoundedWildcards {
	// Can't be done, a List of Integers can't be assigned to a reference to a
	// List
	// of Numbers.
	// static List<Number> intList = new ArrayList<Integer>();

	// But we can...though the list is now logically immutable, we cannot add
	// Objects.
	// static List<? extends Number> intList = new ArrayList<>(Arrays.asList(10,
	// 20, 30, 40));

	static List<Integer> intList = new ArrayList<>(Arrays.asList(10, 20, 30, 40));

	public static void main(String[] args) {
		intList.add(new Integer(100));
		sum(intList);
	}

	/**
	 * Passing anything other than a List<Object> reference will cause a
	 * compilation error.
	 * 
	 * Furthermore the list inside the method is immutable, we cannot add
	 * anything to it as the compiler can't be sure what type of object the list
	 * will contain, and thus cannot allow us to add anything.
	 * 
	 * At runtime a List<Integer> could be passed, or a List<Double>, neither of
	 * these lists could accept a Float object which would still be a subclass
	 * of Number, hence trying to add something gives us a compile error.
	 * 
	 * @param objList
	 */
	public static void sum(List<? extends Number> intList) {
		int sum = intList.stream().collect(Collectors.summingInt(v -> {
			return (Integer) v;
		}));
		System.out.println(sum);
	}

	/**
	 * Will accept a List of anything.
	 * 
	 * @param objList
	 */
	public static void printAnyList(List<?> objList) {
		for (Object o : objList)
			System.out.println(o);
	}
}
