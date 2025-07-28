package corejava;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the no of units ");
		int n =sc.nextInt();
		int count;
		for(int i=1; i<=n; i++) {
			count=i;
			for(int j=1; j<=n; j++) {
				System.out.print(count +" " );
				count=count+n;
			}
			System.out.println();
	}


	}

}
