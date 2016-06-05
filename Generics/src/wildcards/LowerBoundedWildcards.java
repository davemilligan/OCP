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
	
	static List<? super Integer> exampleList;
	static List<Integer> intList;
	static List<Number> numList;

	static List<Object> objectList = new ArrayList<Object>();

	public static void main(String[] args) {
		//  exampleList can reference any superclass of Integer
		exampleList = new ArrayList<Number>();
		exampleList = new ArrayList<Object>();
		//  but not a sibling class
		//exampleList = new ArrayList<Double>();
		
		intList = new ArrayList<Integer>();
		intList.add(100); //  add a int to List<Integer>, boxing it.
		addInteger(intList); //  Now add Integer
		
		numList = new ArrayList<Number>();
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
