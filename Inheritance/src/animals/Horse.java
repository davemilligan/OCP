package animals;

import java.io.FileNotFoundException;

/**
 * 
 * @author david-milligan
 *
 */
public class Horse extends Animal {
	
	/**
	 * The Horse constructor MUST throw the same exception or a superclass of
	 * the exception thrown by the Animal constructor.
	 * 
	 * The reasoning is that the Horse constructor will call super to invoke the
	 * Animal constructor and must be able to handle the exception that the
	 * Animal constructor could throw.
	 * 
	 * @throws Exception
	 */
	public Horse() throws Exception {
		super();
		
		prowl();
		roar();
		Animal a = new Animal();
		a.prowl();
		a.roar();
		
		//  For the inherited static method sleep, it can be called three ways.
		Animal.sleep();
		a.sleep();
		sleep();
	}

	/**
	 * The eat method overrides the eat method in Animal.
	 * 
	 * It MAY only throw the same exception or an exception that is a subclass
	 * of the overridden methods exception.
	 * 
	 * It CANNOT throw an exception that is a superclass of the overridden
	 * methods exception.
	 * 
	 */
	public void eat() throws FileNotFoundException {
		String s = null;
		System.out.println(s);
	}
	
	/**
	 * Cannot define static and instance method with same signature.
	 */
//	public void sleep() {
//		
//	}
}
