package Interface5;
public class TestCars {
	public static void main(String[] args) {
		BMW bmw = new BMW();
		bmw.start();
		bmw.stop();
		bmw.refuel();
		bmw.theftsafety();
		
		System.out.println("--------------------");
		
		Cars car = new BMW();  //creating an object of "BMW" of type "Cars". This is called UPCASTING
		car.start();
		car.stop();
		car.refuel();
		//	car.theft();   we cannot call theftsafety() method as it is coming from BMW class, not from Cars class
	}

}
