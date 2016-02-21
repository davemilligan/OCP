package exception;

import java.io.IOException;

public class ExceptionHandling {

	@SuppressWarnings("finally")
	public static void main(String[] args) throws Exception {
		throwExceptions();
	}
	
	@SuppressWarnings("finally")
	public static void throwExceptions() throws Exception {
		try {
			throw new IOException("Exception in try");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
  		finally{
			throw new Exception("Exception in finally");
		}		
	}

}
