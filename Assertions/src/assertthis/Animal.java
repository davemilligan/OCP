package assertthis;

public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doAssertion(1);
	}

	/**
	 * Its considered appropriate to use assertions to check the arguments
	 * passed to a private method.
	 * 
	 * @param x
	 */
	private static void doAssertion(int x) {
		assert (x > 0) : "X should be greater than zero";
	}

	/**
	 * Its not considered appropriate to use assertions to check the arguments
	 * passed to a public method. An external force could call the method in a
	 * way the developer did not intend, if assert is used to check in
	 * development then it will not be there at runtime.
	 * 
	 * @param x
	 */
	public static void doAssertionPublically(int x) {
		assert (x > 0) : "X should be greater than zero";
	}

}
