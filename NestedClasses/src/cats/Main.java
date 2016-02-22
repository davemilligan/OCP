package cats;

import animals.Animal;
import static animals.Animal.InnerStaticClass;


public class Main {
	public static void main(String[] args) throws Exception {
		Animal animal = new Animal();
		//InnerAnimal ianimal = animal.new InnerAnimal(); // cannot see private inner class.
		
		//InnerBeast iBeast = animal.new InnerBeast(); //  can't see protected from different package.
		//iBeast.eat();
		
		//InnerDog iDog = animal.new InnerDog(); //  can see default classes from different package.
		//iDog.eat();
		
		//  We'll take it for granted that it can see public, but there are alternatives in the way the inner is declared.
		Animal.InnerMe iMe = animal.new InnerMe(); //  can see public anywhere.
		iMe.eat();
		
		InnerStaticClass isc = new Animal.InnerStaticClass(); //  Simples
	}
}

