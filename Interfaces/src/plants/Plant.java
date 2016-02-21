package plants;

import animals.Beast;

/**
 * This class cannot implement CagedBeast since it has default access in
 * another package.
 * 
 * @author david-milligan
 *
 */
class Vegetable extends Plant { // implements CagedBeast {

}

/**
 * This class is just to demonstrate that the variable defined in package
 * animals.Beast does not have default access even though there is no access
 * modifier.
 * 
 * @author david-milligan
 *
 */
public class Plant implements Beast {
	public Plant() {
		String evil = Beast.DAMIAN;
		// cannot set or change an interfaces field, they are always final.
		// Beast.DAMIAN = "666"; // Not allowed, ever.
	}

	/**
	 * Well it could be a venus fly trap!
	 */
	@Override
	public void eat() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dung() {
		// TODO Auto-generated method stub

	}

	@Override
	public void eat(String me) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beCagey() {
		// TODO Auto-generated method stub
		
	}
}
