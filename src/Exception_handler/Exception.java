package Exception_handler;
import java.util.Scanner;
public class Exception {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number : ");
		int n1 =sc.nextInt();    //critical statement
		System.out.println("Enter the Second number : ");
		int n2 =sc.nextInt();     //critical statement
		int r=n1/n2;  //critical statement
		System.out.println(r);
	}

}
