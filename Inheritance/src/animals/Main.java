package animals;

import java.io.IOException;


public class Main {

	public static void main(String[] args) throws Exception {
		Animal animal = new Animal();
		Animal horseAsAnimal = new Horse();
		Horse realHorse = new Horse();
		feedAnimal(animal);
		feedAnimal(horseAsAnimal);
		feedAnimal(realHorse);
		int a[] = { 1,2,053,4};
		System.out.println(a[2]);
	}

	/**
	 * 
	 * @param animal
	 * @throws IOException
	 */
	public static void feedAnimal(Animal animal) throws IOException {
		System.out.println("Got Animal");
		System.out.println(String.format("Animal is animal %s", animal instanceof Animal));
		System.out.println(String.format("Animal is horse %s", animal instanceof Horse));
		animal.eat();
	}

	/**
	 * 
	 * @param horse
	 * @throws IOException
	 */
	public static void feedAnimal(Horse horse) throws IOException {
		System.out.println("Got horse");
		System.out.println(String.format("Animal is animal %s", horse instanceof Animal));
		System.out.println(String.format("Animal is horse %s", horse instanceof Horse));
		horse.eat();
	}
}
