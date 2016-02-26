package wildcards;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Use a Lower Bounded Wildcard when you want to write a method that adds a
 * specific item to a List, where that list could be a List of any superclass of
 * the object you wish to insert.
 * 
 * For example: You want to add an Integer to a list, you can add an Integer to
 * a List<Integer>, List<Number> or List<Object>, but not to a List<Double>.
 * 
 * @author david-milligan
 *
 */
public class LowerBoundedWildcards {
	// Can't be done, a List of Integers can't be assigned to a reference to a
	// List of Numbers.
	// static List<Number> intList = new ArrayList<Integer>();

	// But we can...though the list is now logically immutable, we cannot add
	// Objects.
	// static List<? extends Number> intList = new ArrayList<>(Arrays.asList(10,
	// 20, 30, 40));

	// If we want a list that is mutable then we use a LowerBounded wild card
	// that allows a List the same class or a List of a superclass to be
	// assigned.
	// That way we can be sure that the list will allow us to insert a
	// particular item.
	static List<? super Integer> exampleList = new ArrayList<Integer>();

	// This is also a legal declaration, but this list can only accept an object
	// that is an object that passes the isA test on the least specific
	// subclass.
	static List<? super Integer> exampleList2 = new ArrayList<Number>();

	static List<Integer> intList = new ArrayList<Integer>();

	static List<Number> numList = new ArrayList<Number>();

	static List<Object> objectList = new ArrayList<Object>();

	public static void main(String[] args) {
		intList.add(100); //  add a int to List<Integer>, boxing it.
		addInteger(intList); //  Now add Integer
		
		numList.add(5555L);  // add a Long to List<Number>, again boxing it.
		addInteger(numList); //  Now add Integer
		objectList.add(LocalDate.now()); //  add a LocalDate to List<Object>
		addInteger(objectList); //  Now add Integer
	}

	/**
	 * We can pass any List of an object that is a superclass of Integer, and be
	 * sure that we can add an Integer to that list.
	 * 
	 * @param intList
	 */
	public static void addInteger(List<? super Integer> intList) {
		intList.add(1);
		System.out.println(intList);
	}
}
