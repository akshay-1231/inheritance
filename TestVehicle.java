package Inheritance;

public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicles vehicle = new Vehicles("TATA", 1234, "heavyduty");
		System.out.println(vehicle);
		vehicle.display();
		vehicle.fun();
		System.out.println("=======================");
		MotorCycle motorcycle = new MotorCycle("SPORTS", 2, "BAJAJ", 56789, 213);
		System.out.println(motorcycle);

		motorcycle.display();
		System.out.println("=======================");
		Car car = new Car("toyoya", 232, "zylo", 445, 32435, 3566, "sports");
		System.out.println(car);
		car.display();
		car.fun();
	}

}
