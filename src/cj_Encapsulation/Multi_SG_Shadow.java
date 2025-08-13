package cj_Encapsulation;

class Dog2{
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
public class Multi_SG_Shadow {

	public static void main(String[] args) {
		Dog2 d=new Dog2();
		d.setName("ramu");
		d.setColor("white");
		d.setBreed("bm");
		d.setAge(12);
		System.out.println("Name = "+d.getName());
		System.out.println("Color = "+d.getColor());
		System.out.println("Breed = "+d.getBreed());
		System.out.println("Age = "+d.getAge());
	}

}
