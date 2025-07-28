/**
 * 
 */
package corejava;

import java.util.Scanner;

/**
 *
 * @author HP
 * @category 
 * @description this is an example for Pyramid pattern
 */
public class Newpattern03 {

	/**
	 * @param args
	 * @description this contains source code for pattern
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number ");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=i; j--) {
				System.out.print("- ");
			}
		for(int j=1; j<=2*i-1; j++) {
			System.out.print("$ ");
		}
			System.out.println();
		}

	}

}

