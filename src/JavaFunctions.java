public class JavaFunctions{
	
	public static void main(String[] args) {
		/*int min;
		Scanner minutes=new Scanner(System.in);
		System.out.println("Enter Minutes : ");
		min=minutes.nextInt();*/
		
	JavaFunctions javaObj=new JavaFunctions();
	//sum();
	javaObj.sum(5,4);
	System.out.println(javaObj.jf());
	
	

	}
	
	public  void sum() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
		
	}
	
	public void sum(int a, int b) {
		int c=a*b;
		System.out.println(c);
		this.sum();
	}
	
	public JavaFunctions jf() {
		return this;
	}

}
