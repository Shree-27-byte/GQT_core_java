package corejava;
import java.util.Scanner;
public class Pattern38 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		        System.out.print("Enter number: ");
		        int n = sc.nextInt();

		        for (int i = 0; i < n; i++) {
		            for (int s = 0; s < (n - i - 1) * 2; s++) {
		                System.out.print("  ");
		            }
		            for (int j = 0; j <= i; j++) {
		                System.out.print((char) ('A' + j)+" ");
		                System.out.print("  ");
		            }

		            for (int j = i - 1; j >= 0; j--) {
		                System.out.print((char) ('A' + j)+" ");
		                System.out.print("  ");
		            }

		            System.out.println();
		        }
		    }
		}
