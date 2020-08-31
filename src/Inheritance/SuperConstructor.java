package Inheritance;

class NewAnimal{
	NewAnimal(){
		System.out.println("Animal Created...");
	}
}

class NewDog extends NewAnimal{
	NewDog(){
		super();
		System.out.println("Dog created...");
	}
}

public class SuperConstructor {

	public static void main(String[] args) {
		NewDog dgs = new NewDog();

	}

}
