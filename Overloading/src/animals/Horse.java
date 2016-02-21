package animals;

import java.util.Date;

/**
 * This class demonstrates overloading.
 * 
 * Overloading occurs when the method signature is different, the signature
 * being the method name and parameters.
 * 
 * The method name cannot change otherwise its just a new method, so the
 * parameters MUST change.
 * 
 * The return type is not part of the signature.
 * 
 * Overloading does not depend on Inheritance, but an inherited method can be
 * overloaded.
 * 
 * Overloading does not consider exceptions when overloading, so do what you
 * like.
 * 
 * @author david-milligan
 *
 */
public class Horse extends Animal implements Beast {
	/**
	 * Note eat OVERRIDES eat in Animal, and implements eat in Beast, why is
	 * there no conflict? There is no conflict because not contract is broken.
	 * If Horse tried to implement 2 interfaces that both defined eat this would
	 * cause a conflict and compile would fail.
	 */
	public void eat() {
		System.out.println("Horse eating");
	}

	/**
	 * Overloading does not consider exceptions.
	 * 
	 * @param what
	 * @throws Exception
	 */
	public void speak(String what) throws NoSuchException {
		System.out.println("Whinneys");
	}

	/**
	 * Overloading with different param.
	 * 
	 * @param quiet
	 * @throws Exception
	 */
	public void speak(boolean quiet) throws NoSuchException {
		if (!quiet)
			System.out.println("Whinneys");
	}

	/**
	 * Overloading with different params.
	 * 
	 * @param quiet
	 * @param what
	 * @throws Exception
	 */
	public void speak(boolean quiet, String what) throws NoSuchException {
		if (!quiet)
			System.out.println(what);
	}

	/**
	 * Overloading with different parameters and return type, though return type
	 * is not part of overload.
	 * 
	 * @param what
	 * @param quiet
	 * @return
	 * @throws Exception
	 */
	public String speak(String what, boolean quiet) {
		if (!quiet)
			return what;
		else
			return "sshhhh";
	}

	/**
	 * Overloading doesn't care what you return.
	 * 
	 * @param what
	 * @param quiet
	 * @param seconds
	 * @return
	 */
	public Date speak(String what, boolean quiet, int seconds) {
		if (!quiet)
			return new Date();
		else
			return new Date();
	}

	/**
	 * NOT OVERLOADING BUT OVERRIDING
	 */
	public void speak() {
		System.out.println("Whinneys");
	}

	public void buck() {
		System.out.println("Horse bucking");
	}

	public void buck(int x) {
		System.out.println("Horse bucking");
	}
}
