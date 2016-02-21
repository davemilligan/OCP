package animals;

import java.io.IOException;

/**
 * 
 * @author david-milligan
 *
 */
public class Animal {
	
	public Animal() throws IOException {
		System.out.println("Constructor called on Animal.");
	}
	
	public void eat() throws IOException  {
		System.out.println("Animal eating.");
	}
	
	public static void sleep() {
		System.out.println("Static sleep");
	}
	
	/**
	 * You can overload a static method, but is it really overloading?
	 */
	public void sleep(int howLong) {
		System.out.println("Static sleep");
	}
	
	protected void roar() {
		
	}
	
	void prowl() {
		
	}
}
