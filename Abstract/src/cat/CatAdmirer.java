package cat;

public class CatAdmirer extends BigCat {

	public static void main(String[] args) {
		//  BigCat bigCat = new BigCat(); // cannot instantiate an abstract class.

		BigCat cat = new CatAdmirer();
		CatAdmirer catFan = new CatAdmirer();	
		
	}

	@Override
	String speak() {
		// TODO Auto-generated method stub
		return "I like cats";
	}

}
