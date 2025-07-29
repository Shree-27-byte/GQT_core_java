package corejava;

import java.util.Scanner;

/**
 * @author Shreelakshmi
 * @ description This is used to print my name in a Pattern 
 * @by using conditional statement 
 */
public class Pattern_My_name {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for (int j = 0; j < n; j++) {
                if (i==0||i<=(n/2) && j==0|| i==(n/2)||i>=(n/2) && j==(n-1)||i==(n-1)){
                    System.out.print("# ");//S
                } else {
                    System.out.print("  ");
                }
            } System.out.print(" ");
		
            for(int j=0;j<n;j++) {
				if(j == 0 || 				//vertical line 
				   i==(n/2) ||				//middle line  using(n/2)
				   j==(n-1) ) 				// vertical line at the n value of column
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			
			

            for (int j = 0; j < n; j++) {
                if (i==0||i==(n/2)||
                		j==0||i<=(n/2) && j==(n-1)||
                		j>=(n/2) &&(i==j )){
                    System.out.print("# ");//R
                } else {
                    System.out.print("  ");
                }
            } System.out.print(" ");
            
            for(int j=0;j<n;j++) {
				if(i==0 ||   				//horizontal line
				   j == 0 || 				//vertical line 
				   i==(n-1)	||				//bottom line		
				   i==(n/2) )			 //middle line  using(n/2)
			
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			
			for(int j=0;j<n;j++) {
				if(i==0 ||   				//horizontal line
				   j == 0 || 				//vertical line 
				   i==(n-1)	||				//bottom line		
				   i==(n/2) )			 //middle line  using(n/2)
			
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
	
			
			for(int j=0;j<n;j++) {
				if(j==0 ||   				//horizontal line
				   i==(n-1)	)				//bottom line
				 
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			
			for(int j=0;j<n;j++) {
				if(i==0 ||   				//horizontal line
				   j == 0 || 				//vertical line 
				   i==(n/2) ||				//middle line  using(n/2)
				   j==(n-1) ) 				// vertical line at the n value of column
				{
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
				}
				System.out.print(" ");
			
				

				for(int j=0;j<n;j++) {
					if(j==0 || 				
					   i+j==(n/2)|| 				
					  i-j==(n/2))				
					{
						System.out.print("# ");   //K
					}
					else {
						System.out.print("  ");
					}
					}
				System.out.print(" ");
				
				
				for (int j = 0; j < n; j++) {
	                if (i==0||i<=(n/2) && j==0||
	                		i==(n/2)||i>=(n/2) && j==(n-1)||
	                		i==(n-1)){
	                    System.out.print("# ");//S
	                } else {
	                    System.out.print("  ");
	                }
	            } System.out.print(" ");
			

	            for(int j=0;j<n;j++) {
					if(j == 0 || 				//vertical line 
					   i==(n/2) ||				//middle line  using(n/2)
					   j==(n-1) ) 				// vertical line at the n value of column
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.print(" ");
				
				for(int j=0;j<n;j++) {
					if(j == 0 || 				//vertical line 
					   i==0 ||	
					   j==(n/2) ||
					   j==(n-1) ) 				// vertical line at the n value of column
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.print(" ");
				
				for(int j=0;j<n;j++) {
					if(i==0 || 				//top vertical line 
					   j==(n/2) || 				// middle line of column
					   i==(n-1))				//bottom vertical line 
					{
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.print("    ");
				
				

	            for (int j = 0; j < n; j++) {
	                if (i==0||i==(n/2)||j==0||i<=(n/2) && j==(n-1)||j>=(n/2) &&(i==j )){
	                    System.out.print("# ");//R
	                } else {
	                    System.out.print("  ");
	              
	            
		 }
    }
	
		System.out.println();
		}
}
}