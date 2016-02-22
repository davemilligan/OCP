package animals;

public class Animal implements Beast, DuplicatedAbstractMethodDefinitions {
	
	//  Inner interfaces can be private, but can only be referenced within the outer class.
	private interface GodThisGetsComplex {
		void whyOhWhyWouldYouDoThis();
	}
	
	public final static String DAMIAN = "ANIMAL_DAMIAN";
	//public String DAMIAN = "notallowed";
	
	@Override
	public void eat() throws ChokingOnMeDinnerException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * This overrides the default implementation of the eat(String) interface method.
	 */
	@Override
	public void eat(String me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String eat(String food, String drink) {
		// TODO Auto-generated method stub
		return null;
	}	

	@Override
	public void dung() {
		// TODO Auto-generated method stub
		
	}

	public static String getDamian() {
		return DAMIAN;
	}

	@Override
	public void beCagey() {
		// TODO Auto-generated method stub
		
	}	
	public void sleep() {
		
	}

}
