package Examples;

public class Constructor {
	
	int id;
	String name;
	
	//creating a parameterized constructor  
	public Constructor(int studId, String studName){
		id=studId;
		name=studName;
		
	}
	
	/* Constructor name has to be same as class name and 
	   without any return type
	*/
	
	public static void main(String[] args) {
		
		Constructor s1 = new Constructor(101,"Rajani");
		s1.printRecord();
		
		Constructor s2 = new Constructor(102,"Uday");
		s2.printRecord();
	}
	
	public void printRecord() {
		System.out.println(id);
		System.out.println(name);
	}

}
