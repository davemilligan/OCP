package creational;

public abstract class Car {
	String name;
	
	public Car(String name) {
		this.name = name;
	}

	void cruising() {
		System.out.format("Cruising in a %s%n", name);
	}
}
