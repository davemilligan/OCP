package animals;

/**
 * This class demonstrates Member Inner classes.
 * 
 * Local inner classes behave much in the same way as local variables.
 * 
 * @author david-milligan
 *
 */
public class StaticNestedClassAnimal {

	private String name = "Beowolf";

	public static void main(String[] args) {
		StaticNestedClassAnimal.InnerStaticClass ic = new StaticNestedClassAnimal.InnerStaticClass();

		int valFormStaticNestedClassStaticMethod = StaticNestedClassAnimal.InnerStaticClass.seeMe();
		int valFormStaticNestedClassInstanceMethod = ic.hearMe();
		
	}
	
	/**
	 * So a static inner class:
	 * Can have any access modifier.
	 * can extend, implement at will.
	 * Can be abstract or final.
	 * Can not access instance members of outer class, only through a reference to the outer class.
	 * Can have static members.
	 * @author david-milligan
	 *
	 */
	public static class InnerStaticClass {
		private int value = 0;
		public static int seeMe(){
			System.out.println("Static method invoked.");
			return 5;
		}
		
		public int hearMe(){
			System.out.println("Instance method invoked.");
			return 5;
		}
	}
}
