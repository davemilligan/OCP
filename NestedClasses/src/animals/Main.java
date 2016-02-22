package animals;

import animals.Animal.InnerBeast;
import animals.Animal.InnerDog;
import animals.Animal.InnerMe;

public class Main {

	public static void main(String[] args) throws Exception {
		Animal animal = new Animal();
		//InnerAnimal ianimal = animal.new InnerAnimal(); // cannot see private inner class.
		
		
		InnerBeast iBeast = animal.new InnerBeast(); //  can see protected
		iBeast.eat();
		
		InnerDog iDog = animal.new InnerDog(); //  can see default classes
		iDog.eat();
		
		//  We can see the public inner class, but need an instance of the animal class to instantiate one.
		//InnerMe ia = new InnerMe();
		
		//  Another way of declaring the inner beast.
		Animal.InnerBeast iBeastAlternative = animal.new InnerBeast(); //  can see protected
	}

}
