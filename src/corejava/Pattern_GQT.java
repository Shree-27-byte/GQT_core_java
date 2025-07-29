package corejava;
import java.util.Scanner;
/**
 * 
 */
public class Pattern_GQT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			 for (int j = 0; j < n; j++) {
	                if (i==0||j==(n/2)){
	                    System.out.print("# ");//T
	                } else {
	                    System.out.print("  ");
	                }
	            }System.out.print(" ");
	            
	            for(int j=0;j<n;j++) {
					if(j-i==(n/2) ||
						i+j==((n-1)+(n/2))||
						j>=(n/2) && i==j||
					   i+j==(n/2)|| 				
					  i-j==(n/2))				
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
					}
				System.out.print("        ");
				
				
				for(int j=0;j<n;j++) {
					if(i==0 ||   				//horizontal line
					   j == 0 || 				//vertical line 
					   i==(n-1)	||				//bottom line		
					   j>=(n/2)&&i==(n/2) ||	//half middle line using column >(n/2) & row=(n/2)
					   i>=(n/2)&&j==(n-1) ) 	// half vertical line at the n value of column
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.print("  ");
				
				for(int j=0;j<n;j++) {
					if(j-i==(n/2) ||
						i+j==((n-1)+(n/2))||
						j>=(n/2) && i==j||
					   i+j==(n/2)|| 				
					  i-j==(n/2))				
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
					}
				System.out.print("  ");
				
				for (int j = 0; j < n; j++) {
	                if (i==0||j==(n/2)){
	                    System.out.print("# ");//T
	                } else {
	                    System.out.print("  ");
	                }
	            }System.out.println();
	            
	       
		}
		

	}

}
