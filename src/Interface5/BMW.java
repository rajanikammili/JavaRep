package Interface5;

public class BMW implements Cars {

	@Override
	public void start() {
		System.out.println("BMW --- starts");
		
	}

	@Override
	public void stop() {
		System.out.println("BMW --- stops");
		
	}

	@Override
	public void refuel() {
		System.out.println("BMW --- refuel");		//start(), stop(), refuel() are implemented from "Cars"
		
	}
	
	public void theftsafety() {						//theftsafety() is BMW's own method
		System.out.println("BMW ----theft safety feature"); 
		
		System.out.println(a);
	}
	

}
