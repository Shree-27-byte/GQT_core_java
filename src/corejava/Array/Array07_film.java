package corejava.Array;
import java.util.Scanner;

class ArrayProduction{
	long arr[][][];
	long investment;
	long prev_profit;
	long sum_revenue;
	Scanner sc=new Scanner(System.in);
	
	void createArray() {
		System.out.print("Enter Langage count : ");
		int l = sc.nextInt();
		System.out.print("Enter Catagories counnt in each language : ");
		int c = sc.nextInt();
		System.out.print("Enter movie count in each category : ");
		int m = sc.nextInt();
		
		
		arr=new long[l][c][m];
		
		System.out.println("Array created ");
		System.out.println("------------------");
		
		System.out.print("Investment = ");	
		investment=sc.nextLong();
		System.out.print("Previous year Profit = ");
		prev_profit=sc.nextLong();
		System.out.println("------------------");
	}
	
	void collectData() {
		for(int i=0; i<arr.length; i++) {
			System.out.println("Language: "+(i+1)+" ");
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("Catagory "+(j+1)+" ");
				for(int k=0; k<arr[i][j].length; k++) {
					System.out.print("enter the Revenu of movie"+(k+1)+" ");
				arr[i][j][k]=sc.nextLong();
				sum_revenue +=arr[i][j][k];
			}}
		}
		System.out.println("Data collected ");
		System.out.println("------------------");
	}
	void displayData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside language number:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("inside category no: "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("the revenue of movie number:"+(k+1)+"is ="+arr[i][j][k]);
				}}}
			System.out.println("-------------");
			System.out.println("overall revenue:"+sum_revenue);
			System.out.println("-----------");
			if(sum_revenue > investment) {
				long profit=(sum_revenue-investment);
				System.out.println("the profit made by hemanth is" +profit);
				if(profit>prev_profit) {
					System.out.println("hemanth has made more profit than previous year ");
				}
				else {
					System.out.println("hemanth has  not made more profit than previous year");
				}
			}
			else {
				System.out.println("the loss incured by hemanth is:"+(investment-sum_revenue));
			
			}
		}
 
}

public class Array07_film {

	public static void main(String[] args) {
		ArrayProduction a= new ArrayProduction();
		a.createArray();
		a.collectData();
		a.displayData();

	}

}
