package animals;

/**
 * This class demonstrates Member Inner classes.
 * 
 * Local inner classes behave much in the same way as local variables.
 * 
 * @author david-milligan
 *
 */
public class Animal {

	private String name = "Beowolf";

	public static void main(String[] args) {
		Animal animal = new Animal();
		// Just like private members, the private inner class can be seen inside
		// the class.  But needs an instance of the outer class to instantiate it.
		//InnerAnimal badInner = new InnerAnimal(); //  Will not wash
		
		
		InnerAnimal ianimal = animal.new InnerAnimal();
		animal.eat();
		InnerAnimal inner = animal.makeInnerAnimal();
		inner.speak();
		ianimal.eat();

		// Animal referencedInnerAnimal = ianimal; But is not inheritance
		
		//  However
		//  If the inner class is static, not nested, then it can be instantiated without an instance of the outer class.
		
	}

	public void eat() {
		/**
		 * Local inner classes DO NOT have access specified. Cannot be static or
		 * have static members. Can access members of enclosing class. Do not
		 * have access to local variables unless they are final or effectively
		 * final.
		 * 
		 * @author david-milligan
		 *
		 */
		class Eatery {
			public String eat() {
				return "Eating from eatery -> " + getClass().getName();
			}
		}
		Eatery eatery = new Eatery();
		System.out.println("Animal eating." + eatery.eat());
	}

	public InnerAnimal makeInnerAnimal() {

		/**
		 * An anonymous inner class is created from an existing abstract class
		 * or interface and must be instantiated in one statement using the new
		 * keyword.
		 * 
		 * @author david-milligan
		 *
		 */
		abstract class InnerAnimalFactory {
			abstract InnerAnimal build();
		}

		InnerAnimalFactory f = new InnerAnimalFactory() {

			@Override
			InnerAnimal build() {
				System.out.println("WooHoo! I make a inner animal from an anonymous inner class.");
				return new InnerAnimal();
			}
		};

		return f.build();
	}
	
	/**
	 * So a static inner class:
	 * Can have any access modifier.
	 * can extend, implement at will.
	 * Can be astract or final.
	 * Can not access instance members of outer class, only through a reference to the outer class.
	 * Can have static methods.
	 * @author david-milligan
	 *
	 */
	public static class InnerStaticClass {
		private int value = 0;
	}

	/**
	 * Inner class can have any visibility. Can extend a class or implement
	 * interfaces. Can be final or abstract. Can access outer class members,
	 * including private members. Can NOT have static methods or variables.
	 * 
	 * @author david-milligan
	 *
	 */
	private final class InnerAnimal {
		//
		private String name = "Inner Beowolf";

		public InnerAnimal() {
			System.out.println("InnerAnimal ctor called, I can see Animal name " + name);
			System.out.println("InnerAnimal ctor called, I can see InnerAnimal name " + InnerAnimal.this.name);
			System.out.println("InnerAnimal ctor called, I can see Animal name " + Animal.this.name);
		}

		public void speak() {
			System.out.println("InnerAnimal class speaking.");
		}

		/**
		 * THis is NOT overriding.
		 */
		public void eat() {
			System.out.println("InnerAnimal class eating.");
		}
	}

	/**
	 * Inner class can have any visibility. Can extend a class or implement
	 * interfaces. Can be final or abstract. Can access outer class members,
	 * including private members. Can NOT have static methods or variables.
	 * 
	 * @author david-milligan
	 *
	 */
	protected final class InnerBeast {
		public InnerBeast() {
			System.out.println("InnerBeast ctor called, I can see Animal name " + name);
		}

		public void speak() {
			System.out.println("InnerBeast class speaking.");
		}

		/**
		 * THis is NOT overriding.
		 */
		public void eat() {
			System.out.println("InnerBeast class eating.");
		}
	}

	/**
	 * Inner class can have any visibility. Can extend a class or implement
	 * interfaces. Can be final or abstract. Can access outer class members,
	 * including private members. Can NOT have static methods or variables.
	 * 
	 * @author david-milligan
	 *
	 */
	final class InnerDog {
		public InnerDog() {
			System.out.println("InnerDog ctor called, I can see Animal name " + name);
		}

		public void speak() {
			System.out.println("InnerDog class speaking.");
		}

		/**
		 * THis is NOT overriding.
		 */
		public void eat() {
			System.out.println("InnerDog class eating.");
		}
	}

	/**
	 * Inner class can have any visibility. Can extend a class or implement
	 * interfaces. Can be final or abstract. Can access outer class members,
	 * including private members. Can NOT have static methods or variables.
	 * 
	 * @author david-milligan
	 *
	 */
	public final class InnerMe {
		public InnerMe() {
			System.out.println("InnerMe ctor called, I can see Animal name " + name);
		}

		public void speak() {
			System.out.println("InnerMe class speaking.");
		}

		/**
		 * THis is NOT overriding.
		 */
		public void eat() {
			System.out.println("InnerMe class eating.");
		}
	}
}
