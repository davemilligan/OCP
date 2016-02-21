package animals;

/**
 * This class demonstrates overriding and how a subclass is able to override the
 * methods of a superclass.
 * 
 * Things to note: The method signature MUST be the same in the overriding
 * method. The return type in a subclass can be the same class or a subclass of
 * the return type of the superclass. The access modifier cannot further
 * restrict the visibility of the overridden method. The overriding method MUST
 * throw the same exception or a superclass of the exception thrown by the
 * overridden method.
 * 
 * @author david-milligan
 *
 */
public class Pony extends Horse {
	
	/**
	 * Note that the overridden method returns an object of type HorseDung, therefore
	 * this method MUST return the same type or a sub-type of that class.
	 * 
	 * Note that the access modifier is LESS restrictive that the overridden method.
	 * It CANNOT be more restrictive.
	 */
	public PonyDung makeDung() {
		return new PonyDung("Squeeeezing one out from Horse");
	}
}
