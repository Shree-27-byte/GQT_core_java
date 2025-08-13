package corejava.String;

import java.util.Scanner;

public class String_Buffer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuffer s1=new StringBuffer("Ramayana");
		StringBuffer s2=new StringBuffer("is a good story");
		s1.append(s2);
		System.out.println(s1);
		
		StringBuilder s3=new StringBuilder("Mahabharath");
		StringBuilder s4=new StringBuilder(" is good history ");
		s3.append(s4);
		System.out.println(s3);

	}

}
