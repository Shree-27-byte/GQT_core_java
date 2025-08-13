package corejava.String;

import java.util.Scanner;

public class String_VC {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string : ");
		String s=sc.nextLine();
		int vowel=0;
		int cons=0;
		s=s.toUpperCase();
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)>='A'&& s.charAt(i)<='Z') {
				if(s.charAt(i)=='A' || s.charAt(i)=='E' ||
						s.charAt(i)=='I' || s.charAt(i)=='O' ||  s.charAt(i)=='U') {
					vowel++;
				}
				
				else {
					cons++;
				}
			}
		}
			System.out.println("vowels = "+vowel);
			System.out.println("consonent = "+cons);

	}

}
