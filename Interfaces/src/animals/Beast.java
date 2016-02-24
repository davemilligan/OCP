package animals;

/**
 * This interface has default scope and can be declared in any file.
 * 
 * Interfaces can only have public or default visibility.
 * 
 * @author david-milligan
 *
 */
interface CagedBeast {
	void beCagey();
}

/**
 * This interface has public scope, and as such this file should be declared in
 * a file of the same name as the interface.
 * 
 * Interfaces can only have public or default visibility.
 * 
 * @author david-milligan
 *
 */
public interface Beast extends CagedBeast {
	// Fields in interfaces are public static and final, even if that is not
	// explicitly declared.
	static final int NUMBER = 666;

	// so this is the same thing in that its public static and final.
	String DAMIAN = "BEAST_DAMIAN";

	// Java interfaces are by default public and abstract, even if no access
	// modifier is present, they cannot ever be final duh! Java 8 has default
	// with implementation.
	// As such all implemented interfaces must be public since the access cannot
	// be more restrictive.
	// Classes implementing this method can throw ChokingOnMeDinnerException, a
	// subclass of this or none, they cannot throw anything else.
	abstract void eat() throws ChokingOnMeDinnerException;

	// This is a default implementation of the eat method, classes can choose to
	// override or accept this implementation
	default void eat(String me) {
		System.out.format("Eating %s", me);
	}

	// so this is the same thing, though a different method.
	void dung();
	
	/*
	 * This method is NOT inherited by implementing classes, thus it CANNOT be
	 * overridden and can ONLY be called with an EXPLICIT reference to the
	 * Interface, Beast.makeLikeAStatue().
	 */
	static void makeLikeAStatue() {
		System.out.println("Beast making like a statue");
	}
}
