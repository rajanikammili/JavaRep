package abstractClassesExample5;

//An abstract class can have abstract method and non abstract method
//partial abstraction
//hiding the implementation is called Abstraction
//cannot create objects of abstract class OR cannot instantiate


public abstract class Bank {
	public abstract void loan(); //abstract method
	
	//non - abstract methods
	public void credit() {
		System.out.println("Bank -- Credit");
	}
	public void debit() {
		System.out.println("Bank -- Debit");
	}
}
