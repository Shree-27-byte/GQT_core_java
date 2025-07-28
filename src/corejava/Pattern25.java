package corejava;
import java.util.Scanner;
public class Pattern25 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 System.out.print("Enter number ");
		        int n = sc.nextInt();
		        for (int i = 1; i <=n; i++) {
		        	for (int j = 1; j <= n - i; j++) {
		                System.out.print("  ");
		            }
		        	for (int s = 1; s <= (2 * i - 1); s++) {
		                System.out.print(i + " ");
		            }
		            System.out.println();
		        }
		    }
}

	



	


