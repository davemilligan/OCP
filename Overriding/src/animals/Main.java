package animals;

public class Main {

	public static void main(String[] args) throws Exception {
		Animal animal = new Animal();
		Animal horseAsAnimal = new Horse();
		Horse realHorse = new Horse();
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
