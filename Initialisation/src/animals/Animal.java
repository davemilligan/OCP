package animals;

import java.io.IOException;

/**
 * 
 * @author david-milligan
 *
 */
public class Animal {
	static String ANIMAL_STATIC_VARIABLE = "Animal static variable initialized";

	static { System.out.println("Animal static initialization block executed"); }
	
	{ System.out.println("Animal non-static initialization block executed"); }
	
	public Animal() throws IOException {
		System.out.println("Constructor called on Animal.");
	}

	public static void staticMethod() {
		System.out.println("Animal static method invoked");
	}
}
