package creational;

/**
 * The factory class creates a Car object based on the inputs given, clients do
 * not need to know anything about the implementations of Car other than they
 * can call cruising on a returned object.
 * 
 * @author david-milligan
 *
 */
public class CarFactory {
	public static Car build(String car) {
		switch (car.toLowerCase()) {
		case "ford":
			return new Ford("ford");
		case "bmw":
			return new BMW("beamer");
		case "vw":
			return new VW("scandalous emitter");
		}
		throw new IllegalStateException("Unknown car " + car);
	}
}

class Ford extends Car {

	public Ford(String name) {
		super(name);
	}
}

class BMW extends Car {
	public BMW(String name) {
		super(name);
	}
}

class VW extends Car {

	public VW(String name) {
		super(name);
	}
}
