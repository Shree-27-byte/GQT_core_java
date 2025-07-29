package corejava.Array;

import java.util.Scanner;

class ArrayOp{
	String arr[][];
	Scanner sc=new Scanner(System.in);
	
	void createArray() {
		System.out.print("Enter class count : ");
		int cls = sc.nextInt();
		System.out.print("Enter student in each class : ");
		int stu = sc.nextInt();
		
		arr=new String[cls][stu];
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
		
public class Array03 {

	public static void main(String[] args) {
		ArrayOp a= new ArrayOp();
		a.createArray();
		a.collectData();
		a.displayData();
	}

}
