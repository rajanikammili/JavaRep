import java.util.Scanner;

public class GreatestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner number =new Scanner(System.in);
		System.out.println("Enter Number 1 : ");
		int num1 =number.nextInt();
		System.out.println("Enter Number 2 : ");
		int num2 =number.nextInt();
		System.out.println("Enter Number 3 : ");
		int num3 =number.nextInt();
		
		if (num1 > num2 && num1 > num3) 
				System.out.println(num1 + " is greatest number");
			
		
		if (num2 > num1 && num2 > num3) 
					System.out.println(num2 + " is greatest number");
			
		if (num3 > num1 && num3 > num2) 
				System.out.println(num3 + " is greatest number");
			
		
		
		
	}

}
