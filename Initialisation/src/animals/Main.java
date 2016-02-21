package animals;

/**
 * This class demonstrates the when initialisation of an object actually occurs.
 * 
 * For the class Animal:
 * 		The static initialisation blocks will be called if a static variable is read/written, or a static method is invoked. 
 * 		The non-static initialisation blocks will only be called if an instance of an Animal is created. 
 * For the Horse class:
 *  	The static initialisation blocks will be called in both Animal AND Horse if a static variable is read/written, or a static method is invoked. 
 * 		The non-static initialisation blocks will only be called if an instance of an Horse is created. 
 * 
 * Order of Initialisation:
 * 		If object created:
 * 			superclass static variables/blocks in the order that they appear, from top level down.
 * 			subclass  static variables/blocks in the order that they appear.
 * 			for each superclass from top level down:
 * 				superclass non-static variables/blocks in the order that they appear, from top level down.
 * 				superclass constructor
 * 			subclass non-static variables/blocks in the order that they appear.
 * 			subclass constructor.
 * 
 * 		If static member accessed in subclass:
 * 			superclass static variables/blocks in the order that they appear, from top level down.
 * 			subclass class  static variables/blocks in the order that they appear.
 * 
 * 		If static member accessed in superclass via inheritance in subclass:
 * 			superclass static variables/blocks in the order that they appear, from top level down.
 * 			subclass  static variables/blocks are not initialised.			
 * @author david-milligan
 *
 */
public class Main {

	public static void main(String[] args) throws Exception {
		
//		System.out.println("Invoking static method on Animal");
//		Animal.staticMethod();
//		
//		System.out.println("Printing Horse static variable, inherited from Animal");
//		System.out.println(Horse.ANIMAL_STATIC_VARIABLE);
		
		System.out.println("Printing Horse static variable");
		System.out.println(Horse.HORSE_STATIC_VARIABLE);
//		
//		System.out.println("Initializing Animal");
//		Animal animal = new Animal();
//		
//		System.out.println("Initializing Horse as Animal");
//		Animal horseAsAnimal = new Horse();
		
//		System.out.println("Initializing Horse");
//		Horse realHorse = new Horse();
	}
}
