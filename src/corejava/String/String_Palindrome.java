package corejava.String;

import java.util.Scanner;

public class String_Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string : ");
		String s=sc.nextLine();
		String r="";
		for(int i=s.length()-1; i>=0; i--) {
			r=r+s.charAt(i);
		}
		System.out.println("the reversed String is : "+r);
		if(s.equals(r)==true) {
			System.out.println("the String is palindrome");
		}
		else {
			System.out.println("the String is Not palindrome");
		}
	}

}
