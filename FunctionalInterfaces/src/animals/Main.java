package animals;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) throws Exception {
		List<Animal> animals = new ArrayList<>();
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("turtle", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));

		//  really just an anonymous method, but its a lambda.
		printIfHopper(animals, (Animal a) -> {
			System.out.format("In lambda checking %s %n", a);
			return a.canHop();
		});
		
		//  Dont even need the Type.
		printIfHopper(animals, (a) -> {
			System.out.format("In lambda without type checking %s %n", a);
			return a.canHop();
		});
		
		//  Dont even need the brackets if there is only one parameter.
		printIfHopper(animals, a -> {
			System.out.format("In lambda without brackets checking %s %n", a);
			return a.canHop();
		});
		
		//  In fact if there is only one parameter we can just pass a reference to the method.
		printIfHopper(animals, Animal::canHop);
		
		//  And to print species
		consumeAnimal(animals, a -> printAnimal(a));
		
		//  Or just pass a reference to any method that takes an Animal parameter, and returns void.
		consumeAnimal(animals, Main::printAnimal);
		
		//  Or maybe even, the System.out.println function can take an Animal, and it returns void, what it does is immaterial.
		consumeAnimal(animals, System.out::println);
		
		//  But lastly, there is already a Functional Interface that fulfils the contract we defined in ConsumeAnimal,
		//  The Consumer<T> interface, it has a method accept that accepts an object T, and returns void...perfect.
		useConsumer(animals, System.out::println);
		
		//  If it comes to it our CheckTrait is also redundant as there exist a Functional Interface called Predicate<T>
		//  that has a test(T t) method that returns boolean.
		predicateAnimal(animals, Animal::canHop);
		
		//  In fact we can pass any method reference that fits the test(T t) interface.
		predicateAnimal(animals, Animal::canSwim);
		
		//  and the ArrayList has the removeIf method that take a Predicate
		animals.removeIf(Animal::canSwim);
		System.out.format("Removing swimmers %s", animals);

	}
	
	private static void predicateAnimal(List<Animal> animals, Predicate<Animal> predicate) {
		for (Animal a : animals)
			if (predicate.test(a))
				printAnimal(a);		
	}

	public static void printAnimal(Animal a) {
		System.out.println(a);
	}

	/**
	 * 
	 * @param animals
	 * @param checker
	 *            - Is a Functional Interface, i.e. an interface that has only
	 *            one method, instead of an object of type CheckTrait we can
	 *            pass a Lambda expression which becomes the parameter and body
	 *            of an anonymous implementation of the interface. The lambda is
	 *            mapped to the CheckTrait interface definition: 
	 *            	boolean check(Animal a); 
	 *            So for lambda 
	 *            	a -> a.canHop(); 
	 *            'a' is the parameter to the method.
	 *            'a.canHop()' becomes the body.
	 */
	private static void printIfHopper(List<Animal> animals, CheckTrait checker) {
		for (Animal a : animals)
			if (checker.check(a))
				printAnimal(a);
	}
	
	private static void consumeAnimal(List<Animal> animals, ConsumeAnimal printer) {
		for (Animal a : animals)
			printer.consume(a);
	}
	
	private static void useConsumer(List<Animal> animals, Consumer<Animal> consumer) {
		for (Animal a : animals) {
			System.out.println("Heyyyy using Consumer<T>");
			consumer.accept(a);
		}
	}
}
