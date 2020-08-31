package AbstractAnimal;

public class MyClass {

	public static void main(String[] args) {
		Cat cat=new Cat();  //creating an object of Class Cat
		Dog dog=new Dog();	//creating an object of Class Dog
		
		dog.eat();			//eat() and sleep() are called from parent class "Animal"
		dog.sleep();
		dog.sound();		//sound() is call from the child class "Method Overriding"
		System.out.println("--------------");
		cat.eat();
		cat.sleep();
		cat.sound();
		
	}

}
