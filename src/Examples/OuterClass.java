package Examples;

public class OuterClass {
	
	public static class InnerClass{
		
		 int x=10;
		
	}

	public static void main(String[] args) {
		
		OuterClass.InnerClass out =new OuterClass.InnerClass();
		System.out.println(out.x);

	}

}
