package corejava.Array;
import java.util.Scanner;
// UnStructued array

public class Array01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Student count: ");
		int n =sc.nextInt();
	// creating the array to store n student marks
		int arr[]=new int[n];
	
	//collecting & storing marks of n students
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter the marks of the student no "+(i+1)+" ");
			arr[i]=sc.nextInt();
		}
		System.out.println("------------------");

	// Display marks stored inside the array
		for(int i=0; i<arr.length; i++) {
			System.out.println("The marks of student no "+(i+1)+" is = "+arr[i]);
			
		}
	}

}
