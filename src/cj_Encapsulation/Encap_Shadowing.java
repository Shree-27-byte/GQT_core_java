package cj_Encapsulation;
class Dog{
	private String name;
	private String color;
	private String breed;
	private int age;
	
	void setData1(String name, String color,  String breed, int age) {  // specific setters 
		name=name;
		color=color;
		breed=breed;
		age=age;   // confused, which is instance  and local variable
	}
	void getData1() {       // specific  getters
		System.out.println("Name = "+name);
		System.out.println("Color = "+color);
		System.out.println("Breed = "+breed);
		System.out.println("Age = "+age);
	}
}
public class Encap_Shadowing {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.setData1("bob", "white", "pug", 9);
		d.getData1();
	}

}
