import java.util.Scanner;
public class productOfTwoNumbers {

	public static void main(String[] args) {
		Scanner myObj=new Scanner(System.in); //Create a Scanner Object
		System.out.println("Enter number 1 : ");
		int num1=myObj.nextInt(); // Read user input
		
		System.out.println("Enter number 2 : ");
		int num2=myObj.nextInt();
		
		int product = num1*num2;
		System.out.println("The product of " + num1 +" and " + num2 +" is "+product);
		

	}

}
