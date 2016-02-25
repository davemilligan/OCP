package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This class just highlights a couple of gotchas for me with Arrays and
 * ArrayLists
 * 
 * @author david-milligan
 *
 */
public class ArrayToArrayList {
	static Integer[] intArray = { 10, 20, 30, 40, 50 };

	public static void main(String[] args) {
		arraysAsListGotcha();
		toGetAnUnbackedArrayList();
	}

	/**
	 * This shows that 'Arrays.asList' returns a special fixed size ArrayList
	 * defined as a static nested class in the Arrays class.
	 * 
	 * The new ArrayList is backed by the array and changes to the new ArrayList
	 * are reflected in the original array.
	 */
	public static void arraysAsListGotcha() {
		List<Integer> intList = Arrays.asList(intArray);
		System.out.format("The array object %s%n", Arrays.toString(intArray));
		intList.set(0, 999);
		System.out.format("The array object %s%n", Arrays.toString(intArray));
		System.out.println(intList.getClass().getName());

		// Here the toArray returns an Integer Array, as the backing class is
		// the array we started with.
		System.out.format("The intList.toArray() %s%n", intList.toArray().getClass().getName());
		if (!(intList instanceof ArrayList))
			System.out.println("See its not an ArrayList");

		Integer[] andBackAgain = intList.toArray(new Integer[intList.size()]);
		System.out.format("The array object %s%n", Arrays.toString(intArray));

		Integer[] andBackAgainByCasting = (Integer[]) intList.toArray();
		System.out.format("The array object %s%n", Arrays.toString(intArray));
	}

	/**
	 * This shows that 'Arrays.asList' returns a special fixed size ArrayList
	 * defined as a static nested class in the Arrays class.
	 * 
	 * The new ArrayList is backed by the array and changes to the new ArrayList
	 * are reflected in the original array.
	 */
	public static void toGetAnUnbackedArrayList() {
		List<Integer> intList = new ArrayList<>(Arrays.asList(intArray));
		intList.add(1);
		System.out.format("The array object %s%n", Arrays.toString(intArray));
		System.out.format("The ArrayList object %s%n", intList);
		System.out.println(intList.getClass().getName());
		System.out.println("See its a real ArrayList");
		Integer[] andBackAgain = intList.toArray(new Integer[intList.size()]);
		
		// Here the toArray returns an Object Array, as the backing class is
		// a new ArrayList which contains just Objects.
		System.out.format("The intList.toArray() %s%n", intList.toArray().getClass().getName());
		Object[] andBackAgainByCasting = intList.toArray();
	}
}
