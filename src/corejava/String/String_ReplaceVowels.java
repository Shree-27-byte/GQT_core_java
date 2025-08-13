package corejava.String;

import java.util.Scanner;

public class String_ReplaceVowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string : ");
		String s=sc.nextLine();
		String r="";
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='A' || s.charAt(i)=='E' ||
					s.charAt(i)=='I' || s.charAt(i)=='O' ||  s.charAt(i)=='U' ||
					s.charAt(i)=='a' || s.charAt(i)=='e' ||
					s.charAt(i)=='i' || s.charAt(i)=='o' ||  s.charAt(i)=='u' ) {
				r+="#";
			}
	}System.out.println("Replaced vowels with Special character "+r);
			
}}
