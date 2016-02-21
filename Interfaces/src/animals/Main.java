package animals;

public class Main {

	public static void main(String[] args) throws Exception {

		Animal animal = new Animal();

		// Demonstrating that the apparent ambiguity in the declaration of a
		// variable in both interface and implementing class causes no problem.
		System.out.println(animal.DAMIAN);
		System.out.println(((Beast) animal).DAMIAN);
	}
}
