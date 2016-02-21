package animals;

/**
 * This class demonstrates overriding and how a subclass is able to override the
 * methods of a superclass.
 * 
 * Things to note: The method signature MUST be the same in the overriding
 * method. The return type in a subclass can be the same class or a subclass of
 * the return type of the superclass. The access modifier cannot further
 * restrict the visibility of the overridden method.
 * 
 * It may throw only those exceptions that are declared in the throws clause of
 * the superclass's method or exceptions that are subclasses of the declared
 * exceptions. It may also choose NOT to throw any exception.
 * 
 * @author david-milligan
 *
 */
public class Horse extends Animal {

	/**
	 * Note that the overridden method returns an object of type Dung, therefore
	 * this method MUST return the same type or a sub-type of that class.
	 * 
	 * Note that the access modifier is LESS restrictive that the overridden
	 * method. It CANNOT be more restrictive.
	 */
	protected HorseDung makeDung() {
		return new HorseDung("Squeeeezing one out from Horse");
	}
}
