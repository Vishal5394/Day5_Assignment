package core_program;

import java.util.Scanner;

public class Even_Or_Odd {

	public static void main(String[] args) {
		Scanner HM = new Scanner(System.in);
		System.out.println("enter the no: ");
		int num = HM.nextInt();
		if (num%2==0) 
			System.out.println("is Even no");
		else
			System.out.println("is Odd no");
		
		HM.close();
	}

}
