package cj_Encapsulation;
class Dogg{
	private String name;
	private String color;
	private String breed;
	private int age;
	
	void setData1(String name, String color,  String breed, int age) {  // specific setters 
		this.name=name;
		this.color=color;
		this.breed=breed;
		this.age=age;   // confused, which is instance  and local variable
	}
	void getData1() {       // specific  getters
		System.out.println("Name = "+name);
		System.out.println("Color = "+color);
		System.out.println("Breed = "+breed);
		System.out.println("Age = "+age);
	}
}
public class Encap_ShadowingCorrect {

	public static void main(String[] args) {
		Dogg d=new Dogg();
		d.setData1("bob", "white", "pug", 9);
		d.getData1();
	}

}