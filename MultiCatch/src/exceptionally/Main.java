package exceptionally;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {

	}

	/**
	 * You cannot reassign an exception in a multi-catch block.
	 * 
	 * If throwIt() declares another exception, it has to be handled or thrown or both.
	 * 
	 * @throws A
	 * @throws B
	 */
	public static void catchThis() throws A, B {
		try {
			throwIt();
		} catch (A | B ex) {
			// ex = new Exception("Not allowed");  // ex is FINAL for multi-catch
			// ex = new A();
			throw ex;
		}
	}

	/**
	 * In Java 7 he exception can shorthanded like so, the compiler knows it can
	 * catch an A|B and knows that the exception is not an Exception but an A|B.
	 * 
	 * * If throwIt() declares another exception, it just has to be added to the throws in the signature.
	 * 
	 * @throws A
	 * @throws B
	 */
	public static void catchThat() throws A, B {
		try {
			throwIt();
		} catch (Exception e) {
			//e = new A(); Once re-assigned the exception is of type Exception in the compilers  eyes.
			// throw new Exception(); //wouldn't be allowed
			throw e; // is ok, the compiler knows its an A|B.
		}
	}

	/**
	 * But here the compiler sees that the try block might throw another
	 * exception, and will fail unless the Exception is declared.
	 * 
	 * @throws A
	 * @throws B
	 */
	public static void catchTheOther() throws A, B, Exception {
		try {
			throwIt();
			throw new Exception();
		} catch (Exception e) {
			e = new Exception(); //AND it allows the exception to be reassigned, but as an Exception.
			throw e; // is ok, the compiler knows its an A|B|Exception.
		}
	}

	public static void throwIt() throws A, B {
		// Does nothing really.
	}

}

class A extends IOException {
}

class B extends IOException {
}

class C extends IOException {
}
