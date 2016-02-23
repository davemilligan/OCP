package animals;

/**
 * This class demonstrates Member Inner classes.
 * 
 * An anonymous inner class is a local inner class that does not have a name,
 * otherwise its the same thing.
 * 
 * @author david-milligan
 *
 */
public class AnonymousInnerClassAnimal {

	private String name = "Beowolf";

	public static void main(String[] args) {
		AnonymousInnerClassAnimal animal = new AnonymousInnerClassAnimal();
		animal.anonymousInnerClassMethod();
	}

	/**
	 * 
	 * An anonymous inner class is created from an existing abstract class or
	 * interface and must be instantiated in one statement using the new
	 * keyword.
	 * 
	 * @author david-milligan
	 *
	 */
	public InnerAnimal anonymousInnerClassMethod() {

		/**
		 * Here we define an abstract class.
		 * 
		 * @author david-milligan
		 *
		 */
		abstract class InnerAnimalFactory {
			abstract InnerAnimal build();
		}

		/**
		 * Assigning the anonymous inner class to a reference to the  abstract class.
		 */
		InnerAnimalFactory f = new InnerAnimalFactory() {

			/**
			 * This method instantiates a member inner class and returns it.
			 */
			@Override
			InnerAnimal build() {
				System.out.println("WooHoo! I make a inner animal from within an anonymous inner class.");
				return new InnerAnimal();
			}
		};

		return f.build();
	}

	/**
	 * Member Inner class can have any visibility. Can extend a class or
	 * implement interfaces. Can be final or abstract. Can access outer class
	 * members, including private members. Can NOT have static methods or
	 * variables.
	 * 
	 * @author david-milligan
	 *
	 */
	private final class InnerAnimal {
		//
		private String name = "Inner Beowolf";

		public InnerAnimal() {
			System.out.println("InnerAnimal ctor called");
		}	
	}
}