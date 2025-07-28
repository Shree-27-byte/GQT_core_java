package corejava;
import java.util.Scanner;
public class Pattern30 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 System.out.print("Enter num ");
		 int n=sc.nextInt();
		 for (int i = n; i >= 1; i--) {
		         
		            for (int s = 1; s <= n - i; s++) {
		                System.out.print("  ");
		            }
		            for (int j = 1; j <= 2 * i - 1; j++) {
		                System.out.print(i + " ");
		            }
		            System.out.println();
		        }

		        for (int i = 2; i <= n; i++) {
		          
		            for (int s = 1; s <= n - i; s++) {
		                System.out.print("  ");
		            }
		            for (int j = 1; j <= 2 * i - 1; j++) {
		                System.out.print(i + " ");
		            }

		            System.out.println();
		        }
		    }
}



