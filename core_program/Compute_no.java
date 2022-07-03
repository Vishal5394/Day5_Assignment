package core_program;

import java.util.Scanner;

public class Compute_no {

	public static void main(String[] args) {
		Scanner Co = new Scanner(System.in);
		System.out.println("Enter the dividend no = ");
		int num = Co.nextInt();
		Scanner DI = new Scanner(System.in);
		System.out.println("Enter the dividend no = ");
		int num1 = DI.nextInt();
		int Quotient = num / num1;
		int Reminder = num % num1;
		System.out.println("Quotient ="+ Quotient );
		System.out.println("Reminder ="+ Reminder );
		
		Co.close();
		DI.close();

	}

}
