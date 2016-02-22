package animals;

public class Animal {

	private String name = "Beowolf";

	public static void main(String[] args) {
		Animal animal = new Animal();
		//  Just like private members, the private inner class can be seen inside the class.
		InnerAnimal ianimal = animal.new InnerAnimal();
		animal.eat();
		InnerAnimal inner = animal.makeInnerAnimal();
		inner.speak();
		ianimal.eat();
		
		//  Animal referencedInnerAnimal = ianimal; But is not inheritance
	}
	

	public void eat() {
		System.out.println("Animal eating.");
	}
	
	public InnerAnimal makeInnerAnimal() {
		return new InnerAnimal();
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
