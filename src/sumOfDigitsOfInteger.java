import java.util.Scanner;
public class sumOfDigitsOfInteger {

	public static void main(String[] args) {
		int num;
		int i,sum=0;
		Scanner number = new Scanner(System.in);
		System.out.println("Enter a number");
		num=number.nextInt();
		for(i=0;num!=0;i++) {
		sum=sum+(num%10);
		num=num/10;		
		}
		System.out.println(sum);
	}
}
