package corejava;
import java.util.Scanner;
/**
 * @author Shreelakshmi
 * @ description This is used to print 'A' alphabetic pattern 
 * @by using conditional statement 
 */
public class Pattern_AtoZ_0to9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
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
				System.out.print("  ");
			
				
				
// @ description This is used to print 'B' alphabetic pattern 
// @by using conditional statement 	
			
				
					for(int j=0;j<n;j++) {
						if(i==0 ||   				//horizontal line
						   j == 0 || 				//vertical line 
						   i==(n-1)	||				//bottom line		
						   i==(n/2) ||				//middle line  using(n/2)
						   j==(n-1) ) 				// vertical line at the n value of column
						{
							System.out.print("# ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.print("  ");
					
// @ description This is used to print 'C' alphabetic pattern 
// @by using conditional statement 						
					
					for(int j=0;j<n;j++) {
						if(i==0 ||   				//horizontal line
						   j == 0 || 				//vertical line 
						   i==(n-1)	)				//bottom line
						 
						{
							System.out.print("# ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.print("  ");

// @ description This is used to print 'D' alphabetic pattern 
// @by using conditional statement 


					for(int j=0;j<n;j++) {
						if(i==0 ||   				//horizontal line
						   j == 0 || 				//vertical line 
						   i==(n-1)	||				//bottom line		
						   j==(n-1) ) 				// vertical line at the n value of column
						{
							System.out.print("# ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.print("  ");
					
// @ description This is used to print 'E' alphabetic pattern 
// @by using conditional statement 					
					
					
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
					System.out.print("  ");
					
// @ description This is used to print 'F' alphabetic pattern 
// @by using conditional statement 					
					
					for(int j=0;j<n;j++) {
						if(i==0 ||   				//horizontal line
						   j == 0 || 				//vertical line	
						   i==(n/2) )    			//middle line  using(n/2)
						  
						{
							System.out.print("# ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.print("  ");	
	
// @ description This is used to print 'G' alphabetic pattern 
// @by using conditional statement					
					
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
					
// @ description This is used to print 'H' alphabetic pattern 
// @by using conditional statement						
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
					System.out.print("  ");
					
// @ description This is used to print 'I' alphabetic pattern 
// @by using conditional statement						
					
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
					System.out.print("  ");
					
// @ description This is used to print 'J' alphabetic pattern 
// @by using conditional statement		
					
					for(int j=0;j<n;j++) {
						if(i==0 || 				//top vertical line 
						   j==(n/2) || 				// middle line of column
						   j<=(n/2)&&i==(n-1))				//bottom vertical line 
						{
							System.out.print("# ");
						}
						else {
							System.out.print("  ");
						}
						}
					System.out.print("  ");
					
// @ description This is used to print 'K' alphabetic pattern 
// @by using conditional statement					
					
					for(int j=0;j<n;j++) {
						if(j==0 || 				
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
					
// @ description This is used to print 'L' alphabetic pattern 
// @by using conditional statement		
					
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
					System.out.print("  ");
					
// @ description This is used to print 'M' alphabetic pattern 
// @by using conditional statement						
					
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
					System.out.print("  ");
					
// @ description This is used to print 'N' alphabetic pattern 
// @by using conditional statement		
					
					for(int j=0;j<n;j++) {
						if(j == 0 || 				//vertical line 
						   i==j ||			
						   j==(n-1) ) 				// vertical line at the n value of column
						{
							System.out.print("# ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.print("  ");
					
// @ description This is used to print 'O' alphabetic pattern 
// @by using conditional statement	
					

					for(int j=0;j<n;j++) {
						if(i==0 ||   				//horizontal line
						   j == 0 || 				//vertical line 
						   i==(n-1)	||				//bottom line		
						   j==(n-1) ) 				// vertical line at the n value of column
						{
							System.out.print("# ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.print("  ");
					
// @ description This is used to print 'P' alphabetic pattern 
// @by using conditional statement	
														
					for(int j=0;j<n;j++) {
						if(i==0 ||   				//horizontal line
						   j == 0 || 				//vertical line	
						   i==(n/2) ||    			//middle line  using(n/2)
							i<=(n/2)&&j==(n-1))
							
						  
						{
							System.out.print("# ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.print("  ");	
					
// @ description This is used to print 'Q' alphabetic pattern 
// @by using conditional statement						
					
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
					
// @ description This is used to print 'R' alphabetic pattern 
// @by using conditional statement					
					
					System.out.print("    ");

		            for (int j = 0; j < n; j++) {
		                if (i==0||i==(n/2)||
		                	j==0||i<=(n/2) && j==(n-1)||
		                	j>=(n/2) &&(i==j )){
		                    System.out.print("# ");//R
		                } else {
		                    System.out.print("  ");
		                }
		            } System.out.print("    ");

// @ description This is used to print 'S' alphabetic pattern 
// @by using conditional statement	
		            
		            for (int j = 0; j < n; j++) {
		                if (i==0||i<=(n/2) && j==0||
		                	i==(n/2)||i>=(n/2) && j==(n-1)||
		                	i==(n-1)){
		                    System.out.print("# ");//S
		                } else {
		                    System.out.print("  ");
		                }
		            } System.out.print("    ");

// @ description This is used to print 'T' alphabetic pattern 
// @by using conditional statement	
		            
		            for (int j = 0; j < n; j++) {
		                if (i==0||j==(n/2)){
		                    System.out.print("# ");//T
		                } else {
		                    System.out.print("  ");
		                }
		            }System.out.print("    ");
		            
// @ description This is used to print 'U' alphabetic pattern 
 // @by using conditional statement	

		            for (int j = 0; j < n; j++) {
		            	 if (j==0||i==(n-1)||j==(n-1)) {
		                    System.out.print("# ");
		                } else {
		                    System.out.print("  ");
		                }
		            } System.out.print("    ");

// @ description This is used to print 'V' alphabetic pattern 
// @by using conditional statement	
		            
		            for (int j = 0; j < n; j++) {
		                if (i<=(n/2) && j==0||
		                	i-j==(n/2)||i+j==(n-1)+(n/2)||
		                	i<=(n/2) && j==(n-1)){
		                    System.out.print("# ");
		                } else {
		                    System.out.print("  ");
		                }
		            }  System.out.print("    ");

// @ description This is used to print 'W' alphabetic pattern 
// @by using conditional statement	
		           
		            for (int j = 0; j < n; j++) {
		                if (j==0||i==(n-1)||j==(n/2)||j==(n-1)){
		                    System.out.print("# ");
		                } else {
		                    System.out.print("  ");
		                }
		            } System.out.print("    ");

		            
// @ description This is used to print 'X' alphabetic pattern 
// @by using conditional statement	
		            
		            for (int j = 0; j < n; j++) {
		                if (i==j||i+j==(n-1)){
		                    System.out.print("# ");//x
		                } else {
		                    System.out.print("  ");
		                }
		            } System.out.print("    ");
		            
// @ description This is used to print 'Y' alphabetic pattern 
// @by using conditional statement	

		            for (int j = 0; j < n; j++) {
		                if ((i<=(n/2) &&(i==j || 
		                		i+j==(n-1)))||
		                		i>=(n/2) && j==(n/2)){
		                    System.out.print("# ");//y
		                } else {
		                    System.out.print("  ");
		                }
		            }System.out.print("    ");
		            
 // @ description This is used to print 'Z' pattern 
 // @by using conditional statement	

		            for (int j = 0; j < n; j++) {
		                if (i==0||i+j==(n-1)||i==(n-1)){
		                    System.out.print("# ");
		                } else {
		                    System.out.print("  ");
		                }
		            } System.out.print("    ");
		            
		            
// @ description This is used to print '0'  pattern 
// @by using conditional statement	

		            for (int j = 0; j < n; j++) {
		                if (i==0||j==0||j==(n-1)||i==(n-1)){
		                    System.out.print("# ");//0
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            
// @ description This is used to print '1' pattern 
// @by using conditional statement	
		            
		            for (int j = 0; j < n; j++) {
		                if (i+j==(n/2)||j==(n/2)||i==(n-1)){
		                    System.out.print("# ");//1
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");
		            
// @ description This is used to print '2' pattern 
 // @by using conditional statement	

		            for (int j = 0; j < n; j++) {
		                if (i==(n-1)
		                		||i==0 
		                		|| i==(n/2)
		                		|| i<=(n/2) && j==(n-1)
		                		|| i>=(n/2) && j==0 ){
		                    System.out.print("# ");//2
		                } else {
		                    System.out.print("  ");
		                }
		            } System.out.print("    ");
		            
// @ description This is used to print '3' alphabetic pattern 
// @by using conditional statement	

		            for (int j = 0; j < n; j++) {
		                if (i==0
		                	||j==(n-1)
		                	|| i==(n-1)||
		                	i==(n/2)){
		                    System.out.print("# ");//3
		                } else {
		                    System.out.print("  ");
		                }
		            } System.out.print("    ");
		            
// @ description This is used to print '4' pattern 
// @by using conditional statement	

		            for (int j = 0; j < n; j++) {
		                if (j==(n-1)|| j==0 && i<=(n/2)||i==(n/2) ){
		                    System.out.print("# ");//4
		                } else {
		                    System.out.print("  ");
		                }
		            } System.out.print("    ");

// @ description This is used to print '5' pattern 
 // @by using conditional statement	
		            
		            for (int j = 0; j < n; j++) {
		                if (i==0|| i==(n/2)||i==(n-1)||
		                		i<=(n/2) && j==0||
		                		(i>=(n/2) && j==(n-1))){
		                    System.out.print("# ");//5
		                } else {
		                    System.out.print("  ");
		                }
		            } System.out.print("    ");
		            
 // @ description This is used to print '6' alphabetic pattern 
// @by using conditional statement	

		            for (int j = 0; j < n; j++) {
		                if (i==0||j==0|| i==(n/2)||
		                		i>=(n/2) && j==(n-1)||
		                		i==(n-1)){
		                    System.out.print("# ");//6
		                } else {
		                    System.out.print("  ");
		                }
		            }  System.out.print("    ");

// @ description This is used to print '7' pattern 
 // @by using conditional statement	
		            
		            for (int j = 0; j < n; j++) {
		                if (i==0|| j==(n-1)){
		                    System.out.print("# ");//7
		                } else {
		                    System.out.print("  ");
		                }
		            }System.out.print("    ");
		            
// @ description This is used to print 8' pattern 
// @by using conditional statement	

		            for (int j = 0; j < n; j++) {
		                if (i==0 ||   				//horizontal line
						   j == 0 || 				//vertical line 
						  i==(n-1)	||				//bottom line		
						 i==(n/2) ||				//middle line  using(n/2)
							j==(n-1) ){
		                    System.out.print("# ");//8
		                } else {
		                    System.out.print("  ");
		                }
		            } System.out.print("    ");
		            
// @ description This is used to print '9' pattern 
// @by using conditional statement	

		            for (int j = 0; j < n; j++) {
		                if (i==0||i<=(n/2) && j==0|| 
		                		i==(n/2)||j==(n-1)||i==(n-1)){
		                    System.out.print("# ");//9
		                } else {
		                    System.out.print("  ");
		                }
		            }
					
			System.out.println();
				}
			}
}
