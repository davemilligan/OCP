package cat;

public class CatAdmirer {

	public static void main(String[] args) {
		BigCat bigCat = new BigCat();
		System.out.println(bigCat.name);
		System.out.println(bigCat.hasFur);
		System.out.println(bigCat.hasPaws);
		// System.out.println(bigCat.id); //  private variable cannot be seen outside the class.
	}

}
