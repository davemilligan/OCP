package methodReferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * This class demonstrates that a reference to a method returns a functional
 * interface such that it can be passed to a function where the interface
 * matches.
 * 
 * @author david-milligan
 *
 */
public class Horse {
	private int height, weight;
	private String name;

	public static void main(String[] args) {
		Horse h1 = new Horse("Ned", 10, 12);
		Horse h2 = new Horse("Silver", 14, 10);
		List<Horse> list = new ArrayList<>();
		list.add(h1);
		list.add(h2);
		Collections.sort(list, new HorseHeightComparator());
		System.out.println(list);

		Collections.sort(list, new HorseWeightComparator());
		System.out.println(list);

		// Define a method reference using static method
		Comparator<Horse> heightComparator = HorseHelper::compareHeight;
		Collections.sort(list, heightComparator);
		System.out.println(list);

		// Define a method reference using instance method
		HorseHelper hh = new HorseHelper();
		Comparator<Horse> heightComparatorOnInstance = hh::instanceCompareHeight;
		Collections.sort(list, heightComparatorOnInstance);
		System.out.println(list);
		
		// Define a method reference using instance method without knowing the instance in advance.
		Predicate<String> isEmpty = String::isEmpty;
		
		// Define a method reference using a ctor
		Supplier<ArrayList> supplyArrayList = ArrayList::new;
		
		Collections.sort(list, HorseHelper::compareHeight);
		System.out.println(list);

	}

	public Horse(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return String.format("[%s Height:%d Weight:%d]", getName(), getHeight(), getWeight());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class HorseHeightComparator implements Comparator<Horse> {
	@Override
	public int compare(Horse h1, Horse h2) {
		return (h1.getHeight() < h2.getHeight()) ? -1 : (h1.getHeight() > h2.getHeight()) ? 1 : 0;
	}
}

class HorseWeightComparator implements Comparator<Horse> {
	@Override
	public int compare(Horse h1, Horse h2) {
		return (h1.getWeight() < h2.getWeight()) ? -1 : (h1.getWeight() > h2.getWeight()) ? 1 : 0;
	}
}

class HorseHelper {
	
	public int instanceCompareHeight(Horse h1, Horse h2) {
		return h1.getHeight() - h2.getHeight();
	}
	
	public static int compareHeight(Horse h1, Horse h2) {
		return h1.getHeight() - h2.getHeight();
	}

	public static int compareWeight(Horse h1, Horse h2) {
		return h1.getWeight() - h2.getWeight();
	}
}
