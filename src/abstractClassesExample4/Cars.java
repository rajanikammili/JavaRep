package abstractClassesExample4;

public abstract class Cars {
	
	//creating a default constructor  
	Cars(){         
		System.out.println("Car Created");
	}
	abstract void run();
	void ChangeGear() {
		System.out.println("Gear is working.....");
	}
}
