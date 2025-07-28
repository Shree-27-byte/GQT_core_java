package corejava;

import java.util.Scanner;

public class Pattern09 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the no of units ");
		int n =sc.nextInt();
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=5; j++) {
				System.out.print(i +" ");
			}
			System.out.println();
		}

	}

}
