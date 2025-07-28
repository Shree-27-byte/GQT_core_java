package corejava;
import java.util.Scanner;
public class Pattern22 {
	public static void main(String[] args) {
		System.out.print("Enter Number ");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		for (int i = 1; i < n; i++) {
       
            for (int s = 0; s < i; s++) {
                System.out.print("_  ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("#  ");
            }
			System.out.println();
			sc.close();
		}
	}
}
