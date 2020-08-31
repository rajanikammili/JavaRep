package Inheritance;

class Animal1{
	
	void eat() {
		System.out.println("eating...");
	}
}

class Dog1 extends Animal1{
	void bark() {
		System.out.println("barking...");
	}
}

class Puppy extends Dog1{
	void weep() {
		System.out.println("weeping...");
	}
	
}

public class MultipleInhertitance {

	public static void main(String[] args) {
		
		Puppy cute = new Puppy();
		cute.eat();
		cute.bark();
		cute.weep();
		

	}

}
