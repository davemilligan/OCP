package cat;

public class BigCat {
	//  can be accessed anywhere
	public String name = "Cat";
	
	//  Visible in a subclass by inheritance, or in same package.
	protected boolean hasFur = true;

	//  default access is Invisible outside the package.
	boolean hasPaws = true;
	
	//  Invisible outside the BigCat class.
	private int id;

	public static void main(String[] args) {
		BigCat bigCat = new BigCat();
		System.out.println(bigCat.name);
		System.out.println(bigCat.hasFur);
		System.out.println(bigCat.hasPaws);
		System.out.println(bigCat.id);
	}	
}
