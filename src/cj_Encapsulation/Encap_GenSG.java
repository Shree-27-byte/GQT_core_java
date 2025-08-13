package cj_Encapsulation;

class Lion{
	private String name;
	private String color;
	private String country;
	private int age;
	
	void setData() {  // generic setters 
		name="lion";
		color="white";
		country="india";
		age=9;
	}
	void setData2(String a, String b,  String c, int d) {  // specific setters 
		name=a;
		color=b;
		country=c;
		age=d;
	}
	void getData() {       // specific  getters
		System.out.println("Name = "+name);
		System.out.println("Color = "+color);
		System.out.println("Country = "+country);
		System.out.println("Age = "+age);
	}
	
}
public class Encap_GenSG {

	public static void main(String[] args) {
		Lion l=new Lion();
		l.setData();
		l.getData();
		System.out.println("-------------------");
		l.setData2("ramu","orange","africa",14); // specific  getters
		l.getData();
	}

}
