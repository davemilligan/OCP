package animals;

/**
 * Sheep is in the same package as Horse and Animal, and so can call the
 * protected and default methods.
 * 
 * @author david-milligan
 *
 */
public class Sheep {

	public Sheep() throws Exception {
		Horse h = new Horse();
		h.roar();
		h.prowl();
		
		Animal a = new Animal();
		a.prowl();
		a.roar();
	}

}
