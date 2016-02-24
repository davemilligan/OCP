package functionalinterfaces;

import java.util.List;

import animals.Animal;

/**
 * A functional interface marked as such can only have one abstract method. A
 * functional interface can have static methods and default methods, and still
 * be a functional interface.
 * 
 * @author david-milligan
 *
 */
@FunctionalInterface
public interface Zookeeper {

	/**
	 * Only one abstract method allowed.
	 */
	void feedAnimals();

	/**
	 * Only one abstract method allowed.
	 * Causes a compiler error, since this is annotated as
	 * @FunctionalInterface, take that away and all is forgiven.
	 */
	// void feedAnimals2(); 
	// 

	/**
	 * Default method is allowed.
	 * 
	 * @param animals
	 */
	default void feedAnimals(List<Animal> animals) {
		for (Animal a : animals)
			System.out.println(a);
	}

	/**
	 * Static method is allowed.
	 * 
	 * @param animal
	 */
	static void feedAnimal(Animal animal) {
		System.out.format("%n feeding %s", animal);
	}
}
