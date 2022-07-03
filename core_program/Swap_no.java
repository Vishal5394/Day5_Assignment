package core_program;

import java.util.Scanner;

public class Swap_no {

	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.println("enter the 1st no: ");
		int first = ab.nextInt();
		Scanner cd = new Scanner(System.in);
		System.out.println("enter the 2nd no: ");
		int second = cd.nextInt();
		
		System.out.println("--Before swap--");
		
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        first = first - second;
        second = first + second;
        first = second - first;

        System.out.println("--After swap--");
        
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
        
        ab.close();
		cd.close();

	}

}
