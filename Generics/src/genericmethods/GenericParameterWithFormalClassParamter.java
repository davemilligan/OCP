package genericmethods;

import java.util.Date;

import genericinterfaces.ShippableAbstractCrate;

/**
 * Class demonstrates the use of type parameters, note that the class has not
 * specified a type parameter.
 * 
 * @author david-milligan
 *
 */
public class GenericParameterWithFormalClassParamter<T> {

	public static void main(String[] args) {
		MetalMicky mm = new MetalMicky();
		GenericParameterWithFormalClassParamter<MetalMicky> obj = new GenericParameterWithFormalClassParamter<>();		
		ShippableAbstractCrate<MetalMicky> crate = obj.orderCrate(mm);
		crate.ship(mm);
		
		//  Can still define the formal type parameter for the method 
		ShippableAbstractCrate<Date> dateCrate = obj.<Date>orderOtherCrate(new Date());
		dateCrate.ship(new Date());
		// or leave it to the compiler.
		ShippableAbstractCrate<Date> dateCrate2 = obj.orderOtherCrate(new Date());
		dateCrate2.ship(new Date());
		
	}

	/**
	 * The return type is T, defined by the formal type parameter <T> declared
	 * by the class.
	 * 
	 * The formal type parameter is needed if the method is not using the class
	 * defined type parameter.
	 * 
	 * @param t
	 * @return
	 */
	public ShippableAbstractCrate<T> orderCrate(T t) {
		System.out.println("Shipping " + t.getClass().getName());
		return new ShippableAbstractCrate<T>() {
			@Override
			public void ship(T u) {
				System.out.println("Shipped " + t.getClass().getName());
			}
		};
	}
	
	/**
	 * This method defines its own formal type parameter.
	 * 
	 * @param u
	 * @return
	 */
	public <U> ShippableAbstractCrate<U> orderOtherCrate(U u) {
		System.out.println("Shipping " + u.getClass().getName());
		return new ShippableAbstractCrate<U>() {
			@Override
			public void ship(U u) {
				System.out.println("Shipped " + u.getClass().getName());
			}
		};
	}
}
