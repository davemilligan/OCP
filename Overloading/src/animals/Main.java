package animals;

public class Main {

	public static void main(String[] args) throws Exception {
		Animal animal = new Animal();
		Animal horseAsAnimal = new Horse();
		Horse realHorse = new Horse();
		Beast beastyHorse = new Horse();
		feedAnimal(beastyHorse);
		feedAnimal(animal);
		feedAnimal(horseAsAnimal);
		feedAnimal(realHorse);
	}

	/**
	 * Overloaded method, will be called when the reference type is a animal
	 * 
	 * @param animal
	 * @throws Exception
	 */
	public static void feedAnimal(Animal animal) throws Exception {
		System.out.println("Got Animal");
		System.out.println(String.format("Animal is animal %s", animal instanceof Animal));
		System.out.println(String.format("Animal is horse %s", animal instanceof Horse));
		animal.eat();
		if (!(animal instanceof Horse)) {
			try {
				((Horse) animal).buck(); 
			} catch (ClassCastException ex) {
				System.out.println("Caught:" + ex);
			}
		} else if (animal instanceof Horse) {
			((Horse) animal).buck();
			((Animal) animal).eat(); // even though the object is potentially
										// up-cast to an animal, the runtime
										// knows its a horse.
		}
	}

	/**
	 * Overloaded method, will be called when the reference type is a horse
	 * 
	 * @param animal
	 * @throws Exception
	 */
	public static void feedAnimal(Horse horse) throws Exception {
		System.out.println("Got horse");
		System.out.println(String.format("Animal is animal %s", horse instanceof Animal));
		System.out.println(String.format("Animal is horse %s", horse instanceof Horse));
		horse.eat(); // eat can be called on Horse.
		horse.buck(); // horse can buck.
		if (!(horse instanceof Horse))
			((Horse) horse).buck(); // ClassCastException, object reference
									// points to Animal not horse
		else if (horse instanceof Horse) {
			((Animal) horse).eat(); // even though the object is up-cast to an
									// animal, the runtime knows its a
									// horse. The compiler thinks it can
									// throw an exception as it looks at the
									// reference type, but the derived class
									// does not declare an exception.
		}
	}

	/**
	 * Overloaded method, will be called when the reference type is a beast
	 * 
	 * @param animal
	 * @throws Exception
	 */
	public static void feedAnimal(Beast beast) throws Exception {
		System.out.println("Got Beast");
		System.out.println(String.format("Animal is animal %s", beast instanceof Animal));
		System.out.println(String.format("Animal is horse %s", beast instanceof Horse));
		beast.eat();
	}

}
