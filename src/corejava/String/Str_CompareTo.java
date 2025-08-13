package corejava.String;
import java.util.Scanner;

public class Str_CompareTo {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the string 1 : ");
			String s1=sc.next();
			System.out.print("Enter the string 2 : ");
			String s2=sc.next();
			
			if(s1.compareTo(s2)==0) {
				System.out.println("String are equal");
			}
			else {
				System.out.println("String are not equal");
			}
			System.out.println("----------------------------");
			System.out.print("Enter the string 1 : ");
			s1=sc.next();
			System.out.print("Enter the string 2 : ");
			 s2=sc.next();
			
			if(s1.compareTo(s2)==0) {
				System.out.println("String are equal");
			}
			else {
				System.out.println("String are not equal");
			}
	}

}
