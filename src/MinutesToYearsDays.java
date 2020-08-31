import java.util.Scanner;

public class MinutesToYearsDays {

	public static void main(String[] args) {
		int year,days = 0,remainingDays;
		Scanner minutes=new Scanner(System.in);
		
		System.out.println("Enter minutes : ");
		int min=minutes.nextInt();
		int minsInYear=60*24*365;
		year=min/minsInYear;
		//remainingDays=min%525600;
		days=(min / 60 / 24) % 365;
		System.out.println(year + " Years " + " and " + days + " Days");
		

	}

}
