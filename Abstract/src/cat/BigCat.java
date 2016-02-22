package cat;

public abstract class BigCat {
	//  can be accessed anywhere
	public String name = "Cat";  //  Not static or final by default like interfaces.	
	
	//  could have been left out altogether.
	abstract String speak();

	//  Could define this with exception, subclass can throw subclass, same or none.
//	abstract String speak() throws Exception;
	
	//  Could define this non-abstract.
//	String speak() {
//		System.out.println("Default speak");
//	}
	
	//  not valid, abstract cannot have parenthesis.
//	abstract String speak() {
//		System.out.println("Not valid speak");
//	}
	
	//  not valid, no implementation.
//	String speak();
	
}
