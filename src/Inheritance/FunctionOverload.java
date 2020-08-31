package Inheritance;

public class FunctionOverload {
	
	public static int sum(int a,int b) {
		//System.out.println(a+b);
		return(a+b);
	}
	
	public static void sum(int b,int c,int d) {
		System.out.println(b+c+d);
	}
	
	public static void sum(int c,String name) {
		System.out.println( c + " " + name);
	}
	public static void main(String[] args) {
		System.out.println(sum(4,5));
		sum(4,5,5);
		sum(6,"rajani");
		
		

	}

}
