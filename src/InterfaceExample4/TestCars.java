package InterfaceExample4;

public class TestCars {

	public static void main(String[] args) {

		BMW car = new BMW();
		car.start();
		car.stop();
		car.refuel();
		car.theftSafety();
		
		Cars cars=new BMW(); // dynamic Polymorphism OR Top Casting
		cars.start();
		cars.stop();
		cars.refuel();
		// cars.theftSafety does not exist because we are referring from Cars Interface
		
	}

}
