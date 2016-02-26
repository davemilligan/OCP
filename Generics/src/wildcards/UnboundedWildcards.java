package wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnboundedWildcards {
	//  can do this but the list is immutable
	//static List<?> intList = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
	
	static List<Integer> intList = new ArrayList<>(Arrays.asList(10, 20, 30, 40));

	public static void main(String[] args) {
		// printObjectList(intList); // method can ONLY take list of Objects,
		// nothing else.
		printAnyList(intList); // method can take list of anything.
	}

	/**
	 * Passing anything other than a List<Object> reference will cause a
	 * compilation error.
	 * 
	 * @param objList
	 */
	public static void printObjectList(List<Object> objList) {
		for (Object o : objList)
			System.out.println(o);
	}

	/**
	 * Will accept a List of anything.
	 * @param objList
	 */
	public static void printAnyList(List<?> objList) {
		for (Object o : objList)
			System.out.println(o);
	}

}
