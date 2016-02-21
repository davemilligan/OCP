package exceptionally;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {

	public static void main(String[] args) throws Exception {
		try {
			catchThis();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * You cannot reassign an exception in a multi-catch block.
	 * 
	 * If throwIt() declares another exception, it has to be handled or thrown
	 * or both.
	 * 
	 * @throws Exception
	 * @throws A
	 * @throws B
	 */
	public static void catchThis() throws Exception {
		File file = new File("NoSuchFile.com");
		// try-with-resources try block(inside the brackets) can only contain
		// declarations.
		try (SampleAutoClosable one = new SampleAutoClosable(1); SampleAutoClosable two = new SampleAutoClosable(2)) {
			// scope for resouces is JUST HERE! no further.

			// throw new IOException("There ya go! should all be closed now");
		} catch (Exception ex) {
			System.out.println("In catch");
			ex.printStackTrace();
			// the catch block is OPTIONAL!
			System.out.println("Leaving catch");
		} finally {
			// the finally block is OPTIONAL!, even if present another IMPLICIT
			// finally tidies up resources.
			System.out.println("In finally");
		}
		// finally block is implicit.
	}
}

class SampleAutoClosable implements AutoCloseable {

	private int name;

	public SampleAutoClosable(int name) {
		this.name = name;
	}

	@Override
	public void close() throws Exception {
		System.out.println("Called close method for " + name);
		throw new IOException("slap it up ya from " + name);
	}

}
