package animals;

import animals.MemberInnerClassAnimal.InnerAnimal;
/**
 * A Member Inner class can only be instantiated from an instance of the outer class.
 * @author david-milligan
 *
 */
public class UsingMemberInnerClasses {

	public static void main(String[] args) throws Exception {
		MemberInnerClassAnimal animal = new MemberInnerClassAnimal();
		
		//  Need an instance of the outer class to create member inner class.
		InnerAnimal ia = new MemberInnerClassAnimal().new InnerAnimal();
		InnerAnimal ia2 = animal.createInnerClass();
		InnerAnimal ia3 = MemberInnerClassAnimal.createInnerClassInStaticMethod(new MemberInnerClassAnimal());
		
		System.out.println();
	}

}
