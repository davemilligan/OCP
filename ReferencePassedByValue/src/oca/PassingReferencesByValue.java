package oca;

import java.util.Date;

public class PassingReferencesByValue {

	public static void main(String[] args) {
		String s = "aaa";
		StringBuilder sb = new StringBuilder("bbb");
		Date d = new Date();
		new PassingReferencesByValue().testRefs(s, sb, d);
		System.out.println("s=" + s + " sb=" + sb + " d=" + d);
	}

	/**
	 * Note here that although the objects are accessible, nulling them here
	 * only nulls the local reference variable and not the object the variable
	 * refers to.
	 * 
	 * @param str
	 * @param sb
	 * @param d
	 */
	public void testRefs(String str, StringBuilder sb, Date d) {
		str = str + sb.toString();
		sb.append(str);
		str = null;
		d = null;
		sb = null;
	}

}
