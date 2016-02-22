package cat.species;

import cat.BigCat;

public class Lynx extends BigCat {

	public static void main(String[] args) {
		BigCat bigCat = new BigCat();
		System.out.println(bigCat.name);
		//  System.out.println(bigCat.hasFur); 		//  protected variable cannot be seen outside the package unless in subclass.
		//  System.out.println(bigCat.hasPaws); 	//  default access cannot be seen outside  package.
		//  System.out.println(bigCat.id); 			//  private variable cannot be seen outside the class.
		
		BigCat lynxCat = new Lynx();
		System.out.println(lynxCat.name);
		//  System.out.println(lynxCat.hasFur); 	//  protected variable accessed using superclass reference still cannot be seen.
		//  System.out.println(lynxCat.hasPaws);  	//  default access cannot be seen outside  package.
		//	System.out.println(lynxCat.id); 		//  private variable cannot be seen outside the class.
		
		Lynx lynx = new Lynx();
		System.out.println(lynx.name);
		System.out.println(lynx.hasFur); 			//  protected variable accessed using subclass reference still is visible.
		//  System.out.println(lynx.hasPaws);  		//  default access cannot be seen outside  package.
		//  System.out.println(lynx.id); 			//  private variable cannot be seen outside the class.

	}

}
