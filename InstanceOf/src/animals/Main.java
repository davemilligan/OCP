package animals;

import java.io.IOException;

interface Flyer {
}

class Bird implements Flyer {
}

class Eagle extends Bird {
}

class Bat {
}

public class Main {

	public static void main(String[] args) throws Exception {
		Flyer f = new Eagle();
		Eagle e = new Eagle();
		Bat b = new Bat();
		String str = "I'm a String";
		int s = 0;
		if (str instanceof Object)
			System.out.format("\"%s\" is an Object%n", str);
		// if (str instanceof Date) System.out.println("str is never, and can
		// never be a Date, so wont compile.");

		// if (s instanceof java.lang.String) System.out.println("s is a
		// String"); //can't be done, s is not a String.
		if (f instanceof Flyer)
			System.out.println("f is a Flyer");
		if (e instanceof Bird)
			System.out.println("e is a Bird");
		// if(b instanceof Bird) System.out.println("b is a Bird"); // can't be
		// done, Bird is not in the inheritance hierarchy of Bat.
		if (b instanceof Flyer)
			System.out.println("b is a Bird"); // Can always check if an object
												// is an instance of an
												// Interface, unless that object
												// was declared as final.

		if (null instanceof Flyer)
			System.out.println("Impossible but valid");
		Object o = new Object();
		if (o instanceof Bat)
			System.out.println("An object reference could point to anything.");
	}
}
