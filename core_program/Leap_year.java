package core_program;

import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		Scanner LP = new Scanner(System.in);
		System.out.println(  "Enter the Year in 4 Digit " );
		int Year = LP.nextInt();
		
		if (Year % 4 == 0 && Year > 999 )
			System.out.println(Year + " is leap year ");
		else if (Year % 4 != 0 && Year > 999 )
			System.out.println(Year + " is not leap year ");
		else
			System.out.println(" Error please enter valid year ");
		
		LP.close();
		

	}

}
