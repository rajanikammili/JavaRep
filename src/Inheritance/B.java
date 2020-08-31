package Inheritance;

public class B extends A{
	
	public void print() {
		System.out.println("name : " + name );
	}
	
	public void printName() {
		System.out.println("B--print name");
	}
	
	
	public static void main(String args[]) {
		
		B b1 = new B();
		b1.print();
		b1.printName();
		
	}
}
