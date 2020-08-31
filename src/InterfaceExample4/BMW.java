package InterfaceExample4;

public class BMW implements Cars {

	@Override
	public void start() {
		System.out.println("BMW -- start");
		
	}

	@Override
	public void stop() {
		System.out.println("BMW -- stop");
		
	}

	@Override
	public void refuel() {
		System.out.println("BMW -- refuel");
	}
	
	public void theftSafety() {
		System.out.println("BMW -- Theft Safety");
	}
		
	}


