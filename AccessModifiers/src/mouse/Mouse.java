package mouse;

import cat.BigCat;

public class Mouse {

	public static void main(String[] args) {
		BigCat bigCat = new BigCat();
		System.out.println(bigCat.name);
//		System.out.println(bigCat.hasFur);  //  protected variable cannot be seen outside the package unless in subclass.
//		System.out.println(bigCat.hasPaws); //  default access cannot be seen outside  package.
//		System.out.println(bigCat.id); 		//  private variable cannot be seen outside the class.

	}
}
