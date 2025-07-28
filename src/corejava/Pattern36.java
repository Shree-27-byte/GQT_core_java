package corejava;
import java.util.Scanner;
public class Pattern36{
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter number: ");
		        int n = sc.nextInt();

		        for (int i = 0; i < n; i++) {       
		            for (int j = 1; j <= n - i; j++) {
		                System.out.print("  ");
		            }

		            
		            char ch = (char) ('A' + i);
		            for (int j = 0; j <= i; j++) {
		                System.out.print((char)(ch - j)+ " ");
		            }
		            for (int j = 1; j <= i; j++) {
		                System.out.print((char)('A' + j)+ " ");
		            }

		            System.out.println();
		 		    }
		

	}

}