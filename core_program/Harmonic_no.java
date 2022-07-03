package core_program;

import java.util.Scanner;

public class Harmonic_no {

	public static void main(String[] args) {
		Scanner SD = new Scanner(System.in);
		System.out.println("Enter the nth Harmonic no: ");
		int num = SD.nextInt();
		System.out.println("The Harmonic Series Is : ");
		
		for (int i=1; i<=num; i++) {
		double Harmonic_No = (double)1/i ;
		System.out.println(Harmonic_No + ",");
		
		SD.close();
   }
	}
}