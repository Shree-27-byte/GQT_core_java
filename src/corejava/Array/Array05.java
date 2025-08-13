package corejava.Array;
import java.util.Scanner;

class Array3D{
	String arr[][][];
	Scanner sc=new Scanner(System.in);
	
	void createArray() {
		System.out.print("Enter School count : ");
		int s = sc.nextInt();
		System.out.println("Enter class count in each school : ");
		int c = sc.nextInt();
		System.out.println("Enter Student count in class : ");
		int stu = sc.nextInt();
		
		arr=new String[s][c][stu];
	
		System.out.println("Array created ");
		System.out.println("------------------");
		}
	void collectData() {
		for(int i=0; i<arr.length; i++) {
			System.out.println("Inside the School no "+(i+1)+" ");
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("Inside the Class "+(j+1)+" ");
				for(int k=0; k<arr[i][j].length; k++) {
					System.out.println("Enter the student name in each class "+(k+1)+" ");
				arr[i][j][k]=sc.next();
			}}
		}
		System.out.println("Data collected ");
		System.out.println("------------------");
	}
	void displayData() {
		for(int i=0; i<arr.length; i++) {
			System.out.println("Inside the School no "+(i+1)+" ");
		for(int j=0; j<arr.length; j++) {
			System.out.println("Inside the class no "+(j+1)+" ");
			for(int k=0; k<arr[i][j].length; k++) {
				System.out.println("The name of Student no "+(j+1)+" is "+arr[i][j][k]);
			}}System.out.println("------------------");
	}}
}


public class Array05 {

	public static void main(String[] args) {
		Array3D a= new Array3D();
		a.createArray();
		a.collectData();
		a.displayData();
	}

}
