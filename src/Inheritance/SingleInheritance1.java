package Inheritance;

class Animal {
		
	void eat() {
		System.out.println("eating...");
	}
	
}

class Dog extends Animal{
	
	void bark() {
		System.out.println("barking....");
	}
}

public class SingleInheritance1 {
	
	public static void main (String args[]) {
		Dog d1 = new Dog();
		d1.eat();
		d1.bark();
	}
	
	

}
