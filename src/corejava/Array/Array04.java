package corejava.Array;
//2D array Structured Jagged
import java.util.Scanner;

class Arrayprg{
	String arr[][];
	Scanner sc=new Scanner(System.in);
	
	void createArray() {
		System.out.print("Enter class count : ");
		int cls = sc.nextInt();
		
		arr=new String[cls][];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter the no of Student in each class "+(i+1)+" ");
			arr[i] = new String[sc.nextInt()];
		}
		System.out.println("Array created ");
		System.out.println("------------------");
		}
	void collectData() {
		for(int i=0; i<arr.length; i++) {
			System.out.println("Inside the class no "+(i+1)+" ");
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("Enter the name of Student no "+(j+1)+" ");
				arr[i][j]=sc.next();
			}
		}
		System.out.println("Data collected ");
		System.out.println("------------------");
	}
	void displayData() {
		for(int i=0; i<arr.length; i++) {
			System.out.println("Inside the class no "+(i+1)+" ");
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("The name of Student no "+(j+1)+" is "+arr[i][j]);
			}}System.out.println("------------------");
	}
}
		
public class Array04 {

	public static void main(String[] args) {
		Arrayprg a= new Arrayprg();
		a.createArray();
		a.collectData();
		a.displayData();
	}

}
