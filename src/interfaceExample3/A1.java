package interfaceExample3;

public class A1 implements Printable, Showable{

	@Override
	public void show() {
		System.out.println("Showing....");
		
	}

	@Override
	public void print() {
		System.out.println("Printing....");
		
	}

}
