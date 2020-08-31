package Examples;

public class Test1 {
	int age=3;
	String name;
	public static void main(String[] args) {
		Test1 obj1=new Test1();
		
		obj1.age=10;
		obj1.name="Dhruv";
		System.out.println("Obj1 age : " + obj1.age);
		System.out.println("Obj1 Name : " + obj1.name);
		
		Test1 obj2=new Test1();
		obj2.age=15;
		obj2.age=20;
		obj2.name="Sid";
		System.out.println("Obj2 age : " + obj2.age);
		System.out.println("Obj2 Name : " + obj2.name);
	}

}
