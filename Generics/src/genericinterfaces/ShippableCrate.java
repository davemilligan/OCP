package genericinterfaces;

public class ShippableCrate implements Shippable {

	@Override
	public void ship(Object t) {
		System.out.println("Shipping " + t.getClass().getName());		
	}
}
