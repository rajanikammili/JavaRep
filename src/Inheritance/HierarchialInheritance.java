package Inheritance;

class Animal2{
	private int a=100;
	void eat() {
		System.out.println("eating...");
		System.out.println(a);
	}
}

class Dog2 extends Animal2{
	
	void bark() {
		System.out.println("barking...");
		
	}
}

class Cat extends Animal2{
	
	void meow() {
		System.out.println("meowing...");
		//System.out.println(a);
	}
}


public class HierarchialInheritance {

	public static void main(String[] args) {
		
		Cat kitty = new Cat();
		kitty.eat();
		kitty.meow();
		

	}

}
