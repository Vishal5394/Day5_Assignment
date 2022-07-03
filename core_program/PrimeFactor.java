package core_program;

import java.util.Scanner;

public class PrimeFactor {
public void prime() {

		Scanner AZ = new Scanner(System.in);
		System.out.println("Enter the no:");
		int num = AZ.nextInt();
		
		for(int i=2; i<=num; i++) {
			while(num%i==0) {
				System.out.println(i+ " ");
				num/=i;
			}
			AZ.close();	
		}
	}
public static void main(String[] args) {
		 PrimeFactor p=new PrimeFactor();
	       p.prime();
			
	}
}