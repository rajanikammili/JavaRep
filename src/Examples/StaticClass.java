package Examples;

class StaticClass {
	static int stud_Id=10;
	static String name="Rajani";
	static void display() {
		System.out.println("Static Method");
	}
	static {
		System.out.println("Static Block");	} //Static Block


	public static void main(String[] args) {
		
		System.out.println("Student ID " + stud_Id);
		System.out.println("Student name " +name);
		display();
		
		IfCondition ifc =new IfCondition(); // creating an object of another class
		ifc.SimpleIf();
		
	}

}



