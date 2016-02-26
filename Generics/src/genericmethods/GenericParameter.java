package genericmethods;

import genericinterfaces.ShippableAbstractCrate;

/**
 * Class demonstrates the use of type parameters, note that the class has not
 * specified a type parameter.
 * 
 * @author david-milligan
 *
 */
public class GenericParameter {

	public static void main(String[] args) {
		MetalMicky mm = new MetalMicky();
		// We can specify the formal type parameter for the method call like so.
		ShippableAbstractCrate<MetalMicky> crate = GenericParameter.<MetalMicky> orderCrate(mm);

		// Or leave it out and the compiler will figure it out.
		ShippableAbstractCrate<MetalMicky> crate2 = GenericParameter.orderCrate(mm);
		crate.ship(mm);
	}

	/**
	 * The return type is T, defined by the formal type parameter <T> declared
	 * before the return type.
	 * 
	 * The formal type parameter is needed if the method is not using the class
	 * defined type parameter.
	 * 
	 * @param t
	 * @return
	 */
	public static <T> ShippableAbstractCrate<T> orderCrate(T t) {
		System.out.println("Shipping " + t.getClass().getName());
		return new ShippableAbstractCrate<T>() {
			@Override
			public void ship(T u) {
				System.out.println("Shipped " + t.getClass().getName());
			}
		};
	}
}
