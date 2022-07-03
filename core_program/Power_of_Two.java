package core_program;

import java.util.Scanner;

public class Power_of_Two {

	public static void main(String[] args) {
		Scanner AB = new Scanner(System.in);
		System.out.println( "Enter the Power no : " );
		int num1 = AB.nextInt();
		int num = 2;
		double Power_of_Two = Math.pow(num, num1);
		System.out.println("Power of 2^ " + num1+ " = "+ Power_of_Two );
		AB.close();
	}

}
