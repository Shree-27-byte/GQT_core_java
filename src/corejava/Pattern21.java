package corejava;
import java.util.Scanner;
public class Pattern21 {
	public static void main(String[] args) {
		System.out.print("Enter number ");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
	
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {
				System.out.print(" _ ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("  #");
			}
			System.out.println();
			sc.close();
		}

	}

}
