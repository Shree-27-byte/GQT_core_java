package constructor;

class Animal {
	public Animal(){
		super();
		System.out.println(" Animal zero parameterized constructor is invoked ");
	}
	public Animal(String message) {
		super();
		System.out.println(" Animal parameterized constructor is invoked ");
		System.out.println(" the animal constructor has recived a messages as :  "+message);
	}
}
class Elephant extends Animal{
	String name;
	double weight;
	public Elephant() {
		super("hello from elephant");
		System.out.println(" Hiiiiiiiii from elphant constructor ");
	}
	public Elephant(String name, double weight) {
		super();
		this.name=name;
		this.weight=weight;
		System.out.println(this.name);
		System.out.print(this.weight);
	}
}

public class Inheritance {
 public static void main(String[] args) {
	 Elephant e= new Elephant();
	 System.out.println("----------------------------");
	 Elephant e1=new Elephant(" arjunaaa", 560);
 }
}
