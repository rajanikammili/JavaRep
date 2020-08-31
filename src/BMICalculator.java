import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {

		Scanner bmi = new Scanner(System.in);
		System.out.println("Enter weight in Pounds  :");
		int pounds=bmi.nextInt();
		System.out.println("Enter height in inches  :");
		double height=bmi.nextLong();
		double bmiCalc=(pounds * 0.45359237)/(height*0.0254*height*0.0254);
		System.out.println("BMI : " + bmiCalc);
		
	}

}
