package corejava.Array;
import java.util.Scanner;
//STRUCTURED array


class Array_programs{
		int arr[];
		Scanner sc=new Scanner(System.in);
		
		// creating the array to store n student marks
		void createArray() {
		System.out.print("Enter the Student count: ");
		int n =sc.nextInt();
		arr=new int[n];
		System.out.print("Array Created ");
		System.out.println("------------------");
		}
		
	//collecting & storing marks of n students
		void collectData() {
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter the marks of the student no "+(i+1)+" ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Data stored into the array");
		}

	// Display marks stored inside the array
		void displayData() {
		for(int i=0; i<arr.length; i++) {
			System.out.println("The marks of student no "+(i+1)+" is = "+arr[i]);
		}
		}
	}
public class Array02{
		public static void main(String[] args) {
			Array_programs a= new Array_programs();
			a.createArray();
			a.collectData();
			a.displayData();
	}

}