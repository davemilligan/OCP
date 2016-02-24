package creational;

public class CarDealer {

	public static void main(String[] args) {
		Car car = CarFactory.build("ford");
		car.cruising();
		
		car = CarFactory.build("bmw");
		car.cruising();
		
		car = CarFactory.build("vw");
		car.cruising();
		
		car = CarFactory.build("dacia");
		car.cruising();
	}

}
