package genericinterfaces;

/**
 * This class implements the Shippable interface and declares the type for the
 * class, this class thus only deals with shipping Robots.
 * 
 * @author david-milligan
 *
 */
public class ShippableRobotCrate implements Shippable<Robot> {

	@Override
	public void ship(Robot t) {
		System.out.println("Shipping a robot");
	}

}
