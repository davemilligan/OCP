package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionMethods {
    static List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
	public static void main(String[] args) {
		//showCollectionMethods(list);
		showListMethods(list);
		showSetMethods(list);
	}
	
	/**
	 * Demonstrating the methods in the Collection interface. 
	 * @param collection
	 */
	public static void showCollectionMethods(List<Integer> collection) {
		List<Integer> list = new ArrayList<Integer>(collection);
		System.out.println(list.add(new Integer(99)));
		System.out.println(list.remove(1));
		System.out.println(list.remove(new Integer(1)));
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		list.clear();
		System.out.println(list.contains(1));
		System.out.println(list);
	}

	/**
	 * Demonstrating the methods in the List interface. 
	 * @param list
	 */
	public static void showListMethods(List<Integer> collection) {
		List<Integer> list = new ArrayList<Integer>(collection);
		list.add(1, new Integer(999)); //  overload returns void.
		System.out.println(list.get(1)); // returns item at index.
		System.out.println(list.indexOf(1)); // returns index of item
		System.out.println(list.lastIndexOf(1)); // returns last index of item
		System.out.println(list.set(1, new Integer(99999)));
		System.out.println(list);
	}
	
	/**
	 * Demonstrating the methods in the Set interface. 
	 * @param list
	 */
	public static void showSetMethods(List<Integer> collection) {
		Set<Integer> set = new HashSet<Integer>(collection);
		System.out.println(set.add(new Integer(999))); //  t/f.
		System.out.println(set.add(new Integer(999))); //  t/f.
		//  No other extra methods to know for OCP
		System.out.println(set);
	}
}
