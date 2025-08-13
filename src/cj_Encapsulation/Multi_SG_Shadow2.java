package cj_Encapsulation;

import java.util.Scanner;

class Dog3{
	private String name;
	private String color;
	private String breed;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
public class Multi_SG_Shadow2 {

	public static void main(String[] args) {
		Scanner d=new Scanner(System.in);
		System.out.print("Enter dog name : ");
		String str=d.nextLine();
		System.out.print("Enter dog color : ");
		String str1=d.nextLine();
		System.out.print("Enter dog breed : ");
		String str2=d.nextLine();
		System.out.print("Enter dog age : ");
		int str3=d.nextInt();
	}

}
