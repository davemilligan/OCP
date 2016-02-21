package animals;

import java.io.FileNotFoundException;

/**
 * 
 * @author david-milligan
 *
 */
public class Horse extends Animal {
	
	static String HORSE_STATIC_VARIABLE = "Horse static variable initialized";
	
	static { System.out.println("Horse static initialization block executed"); }
	
	{ System.out.println("Horse non-static initialization block executed"); }
	
	public Horse() throws Exception {
		System.out.println("Constructor called on Horse.");
	}
}
