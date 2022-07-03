package core_program;

import java.util.Scanner;

public class Vowel_or_consonant {

	public static void main(String[] args) {
		Scanner Co = new Scanner(System.in);
		System.out.println("Enter the Aphabetical letters =  ");
		char ch = Co.next().charAt(0);
		
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
		
		Co.close();

	}

}
