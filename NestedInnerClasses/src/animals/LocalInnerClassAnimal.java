package animals;

/**
 * This class demonstrates Local Inner classes.
 * 
 * A local inner classes is nested within a method.
 * 
 * Like member inner classes, local inner classes cannot be static and cannot
 * have static members.
 * 
 * Local inner classes can only be used within the method in which they are
 * defined.
 * 
 * @author david-milligan
 *
 */
public class LocalInnerClassAnimal {

	private String name = "Beowolf";

	public static void main(String[] args) {
		LocalInnerClassAnimal animal = new LocalInnerClassAnimal();
	}

	/**
	 * Local inner classes DO NOT have access specified. Cannot be static or
	 * have static members. Can access members of enclosing class. Do not have
	 * access to local variables unless they are final or effectively final.
	 * 
	 * Local classes in static methods can only refer to static members of the
	 * enclosing class.
	 */
	public void methodWithLocalInnerClass() {
		int effectivelyfinallength = 0;
		int notfinallength = 5; // This cannot be used in local class.
		notfinallength = 6;
		/**
		 * 
		 * 
		 * @author david-milligan
		 *
		 */
		class Eatery {
			public String eat() {
				return "Eating from eatery -> using notfinal var" + getClass().getName() + " " + effectivelyfinallength;
			}
		}
		Eatery eatery = new Eatery();
		System.out.println("Animal eating." + eatery.eat());
	}
}
