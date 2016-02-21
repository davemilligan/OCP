package stringythings;

public class Test {

	public static void main(String[] args) {
		// In quotes is a string literal.
		String greeting = "This is a string literal";

		// creating a string from a char array.
		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
		String helloString = new String(helloArray);
		System.out.println(helloString);

		int len = helloString.length();
		System.out.println(len);
		char[] helloStringChars = new char[len];
		helloString.getChars(0, len, helloStringChars, 0);
		System.out.println(helloStringChars);

		String concatString = greeting.concat(helloString);
		System.out.println(concatString);

		String concatLiterals = "literal1".concat("literal2");
		System.out.println(concatLiterals);

		String anotherConcat = "literal3" + "literal4";
		System.out.println(anotherConcat);

		float f = Float.valueOf("0.5").floatValue();
		System.out.println(f);

		int i = Integer.valueOf("234").intValue();
		System.out.println(i);

		f = Float.parseFloat("0.5");
		System.out.println(f);

		i = Integer.parseInt("234");
		System.out.println(i);

		String intStr = Integer.toString(500);
		String floatString = Float.toString(0.5f);
		System.out.println(String.format("%s %s", intStr, floatString));

		int s = 5;
		s += s + mx(s) + ++s;
		System.out.println(s);
		
		Boolean bo = new Boolean(true);
		boolean b = true;
		String str = 4 + 3 + "";
		System.out.println(bo.toString(true) + null);
		System.out.println(4 + 3 + "");
		System.out.println("" + 4 + 3);
		System.out.println(4 + 3);
		String nullString = null;
		System.out.println(nullString);
		//System.out.println(null);
		try {
			Float x = 1f;
		}
		catch (Exception ex) {
			//  you can try to catch an exception even where one is not expected known to be thrown.
		}
		
//		System.out.println(true + null);
//		System.out.println(false + null);
//		System.out.println(1 + null);
//		System.out.println(2.0 + null);
	}

	

	public static int mx(int s) {
		for(int i=0; i<3; i++) { 
			s = s + i; 
		}		
		return s;		
	}
}
