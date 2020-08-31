import java.util.Scanner;
public class averageOfThreeNumbers {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		double average;
		System.out.println("Enter number 1 : ");
		num1 = myObj.nextInt();
		System.out.println("Enter number 2 : ");
		num2 = myObj.nextInt();
		System.out.println("Enter number 3 : ");
		num3 = myObj.nextInt();
		average=(num1+num2+num3)/3;
		System.out.println("The average of "+ num1 + ", " + num2 + " and "+ num3 + " is " +average);
		
		
	}

}
