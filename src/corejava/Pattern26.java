package corejava;
import java.util.Scanner;
public class Pattern26 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 System.out.print("Enter number ");

		        int n=sc.nextInt();
		        
		        for (int i = 1; i <=n; i++) {
		
		            for (int s = 1; s <= n - i; s++) {
		                System.out.print("  ");
		            }

		            for (int j = 1; j <= (2 * i - 1); j++) {
		                System.out.print(j + " ");
		            }    
		            System.out.println();
		        }
		    }
		
	}



