package Inheritance;

class Animals{
	
	String color ="White";
	
	void eat() {
		System.out.println("eating....(parent method)");
	}
}

class Dogs extends Animals{
	
	String color="Black";
	
	void eat() {
		System.out.println("eating bread...(current class method)");
		super.eat(); //parent method
	}
	
	void printcolor() {
		
		System.out.println("Color of curent class : " +  color);
		System.out.println("Color of parent class : " +  super.color);
	}
}

public class Super {

	public static void main(String[] args) {
		Dogs dg = new Dogs();
		dg.printcolor();
		dg.eat();
		

	}

}
