package corejava;
import java.util.Scanner;
public class Pattern19 {

	public static void main(String[] args) {
		System.out.print("Enter number ");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int count=1;
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(count++ +"  ");
			}
		
			System.out.println();
		}

	}

}
