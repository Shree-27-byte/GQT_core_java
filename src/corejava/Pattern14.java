package corejava;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the no of units ");
		int n =sc.nextInt();
	
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print("* " );
		
			}
			System.out.println();
	}

	}

}
