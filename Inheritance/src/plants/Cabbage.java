package plants;

import java.io.IOException;

import animals.Animal;
import animals.Horse;

/**
 * Cabbage is in another package from Animal and Horse, but extends Horse, so it
 * can call roar; a protected method, but not prowl a method with default
 * access.
 * 
 * @author david-milligan
 *
 */
public class Cabbage extends Animal {

	public Cabbage() throws IOException {
		roar();
		// prowl();
		
		Animal a = new Animal();
//		a.roar();
//		a.prowl();
	}

}
