package numbers;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		go();
		
		List li = new ArrayList();
		for (int i = 1; i < 50; i += 2)
		    li.add(i);  //  Autoboxing at work
		
		System.out.println(li.get(0).getClass()); //  see!!
		
		List<Integer> li2 = new ArrayList<>();
		for (int i = 1; i < 50; i += 2)
		    li2.add(i); //  Autoboxing at work
		
		printInt(li2.get(0)); // Unboxing at work
		System.out.println(li2);

	}
	
	/**
	 * Unboxing at work
	 * @param i
	 */
	static void printInt(int i) {
		System.out.println(i);
	}

	static public void customFormat(String pattern, double value) {
		DecimalFormat myFormatter = new DecimalFormat(pattern);
		String output = myFormatter.format(value);
		System.out.println(value + "  " + pattern + "  " + output);
	}

	static public void go() {

		customFormat("###,###.###", 123456789.789); // formats 1000's
		customFormat("###.##", 123456.789); //  rounds decimal places
		customFormat("£000000.000", 123.78); // pads zeros
		customFormat("$###,###.###", 12345.67);
	}

}
