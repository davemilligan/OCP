package animals;

/**
 * This class demonstrates Member Inner classes.
 * 
 * @author david-milligan
 *
 */
public class MemberInnerClassAnimal {

	private String name = "Beowolf";

	public static void main(String[] args) {
		MemberInnerClassAnimal animal = new MemberInnerClassAnimal();
		InnerAnimal inner1 = animal.createInnerClass();
		InnerAnimal inner2 = createInnerClassInStaticMethod(animal);
	}

	/**
	 * The inner class is a member of the outer class and can be seen by or from
	 * within an instance of the outer class. As this is an instance method it
	 * can instantiate an inner object directly using 'new InnerClass()'.
	 * 
	 * @param animal
	 * @return InnerAnimal
	 */
	public InnerAnimal createInnerClass() {
		InnerAnimal ianimal = new InnerAnimal();
		return ianimal;
	}

	/**
	 * In this method an instance of the outer class is needed to instantiate
	 * the inner using 'animal.new InnerClass()'.
	 * 
	 * @param animal
	 * @return InnerAnimal
	 */
	public static InnerAnimal createInnerClassInStaticMethod(MemberInnerClassAnimal animal) {
		InnerAnimal ianimal = animal.new InnerAnimal();
		return ianimal;
	}

	/**
	 * A member inner class can have any visibility, this inner class has public
	 * visibility. A member inner class cannot be static or declare any static
	 * members. A member inner class can extend the outer class, or any class. A
	 * member inner class can implement any interface. A member inner class can
	 * be final, or abstract. A member inner class can access any members of the
	 * outer class.
	 * 
	 * Though an inner class is a meber of the outer class, that does not mean
	 * it isA outer.
	 * 
	 * @author david-milligan
	 *
	 */
	public final class InnerAnimal {
		// But an inner class cannot declare static members.
		// private static String notAllowed = "no way";

		private String name = "Inner Beowolf";

		public InnerAnimal() {
			System.out.println("When outer and inner both have property called 'name'");
			System.out.println("Using 'name' gives inner class property " + name);
			System.out.println("Using 'this.name' gives inner class property " + this.name);
			System.out.println("Using 'InnerAnimal.this.name' gives inner class property " + InnerAnimal.this.name);
			System.out.println("Using 'MemberInnerClassAnimal.this.name' gives outer class property "
					+ MemberInnerClassAnimal.this.name);
		}
	}
}
