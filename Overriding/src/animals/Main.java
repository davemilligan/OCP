package animals;

public class Main {

	public static void main(String[] args) throws Exception {
		Animal animal = new Animal();
		Animal horseAsAnimal = new Horse();
		Horse realHorse = new Horse();
		feedAnimal(animal);
		feedAnimal(horseAsAnimal);
		feedAnimal(realHorse);
		
		//  Hidden static methods and variables are decided at compile time, all other methods are late bound (polymorphic).
		animal.speak(); // static method in Animal cannot be overridden.
		horseAsAnimal.speak(); // static method in Animal cannot be overridden.
		realHorse.speak(); // static method in Horse hides the Animal speak.
		
		System.out.println(animal.name);
		System.out.println(horseAsAnimal.name);
		System.out.println(realHorse.name);
		
		System.out.println(animal.NICKNAME);
		System.out.println(horseAsAnimal.NICKNAME);
		System.out.println(realHorse.NICKNAME);
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
		animal.makeDung();
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
		horse.makeDung();
	}
}
