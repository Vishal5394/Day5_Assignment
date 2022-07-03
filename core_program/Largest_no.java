package core_program;

import java.util.Scanner;

public class Largest_no {

	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.println("enter the 1st no: ");
		int num1 = ab.nextInt();
		Scanner cd = new Scanner(System.in);
		System.out.println("enter the 2nd no: ");
		int num2 = cd.nextInt();
		Scanner df = new Scanner(System.in);
		System.out.println("enter the 3rd no: ");
		int num3 = df.nextInt();
		
		if (num1 > num2 && num1 > num3)
			System.out.println("Largest no = "+ num1);
		else if (num2 > num1 && num2 > num3)
			System.out.println("Largest no = "+ num2);
		else 
			System.out.println("Largest no = "+ num3);
		ab.close();
		cd.close();
		df.close();
	}

}
