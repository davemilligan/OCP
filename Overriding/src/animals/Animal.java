package animals;

/**
 * This class demonstrates overriding and how a subclass is able to override the
 * methods of a superclass.
 * 
 * Things to note: 
 * The method signature MUST be the same in the overriding method. 
 * The return type in a subclass can be the same class or a subclass of the return type of the superclass. 
 * The access modifier cannot further restrict the visibility of the overridden
 * method. 
 * The overriding method MUST throw the same exception or a superclass
 * of the exception thrown by the overridden method.
 * 
 * @author david-milligan
 *
 */
public class Animal {
	Dung makeDung() {
		return new Dung("Squeezing one out from Animal");
	}
}
