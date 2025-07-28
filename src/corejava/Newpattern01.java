package corejava;

/**
 * # # # # # 
 * # _ _ _ #
 * # _ _ _ #
 * # _ _ _ #
 * # # # # # 
 */
import java.util.Scanner;
/*
 * @author HP
 * @category 
 * @description this is an example for conditional pattern
 */
public class Newpattern01 {

	/**
	 * @param args
	 * @description this contains source code for pattern
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number ");
		int n=sc.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==0 || i==(n-1)|| j==0 || j==n-1) {
					System.out.print("# ");
				}
				else {
					System.out.print("_ ");
				}
			}System.out.println();
		}

	}

}
