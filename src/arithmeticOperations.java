import java.util.Scanner;
public class arithmeticOperations {

	public static void main(String[] args) {
		Scanner myObj=new Scanner(System.in);
		int num1;
		int num2;
		double temp;
		System.out.println("Enter number 1 : ");
		num1=myObj.nextInt();
		temp=num1;
		System.out.println(temp);
		System.out.println("Enter number 2 : ");
		num2=myObj.nextInt();
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
		System.out.println(num1 + "x" + num2 + "=" + (num1 * num2));
		System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
		System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));
	}

}
