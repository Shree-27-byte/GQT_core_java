package constructor;
class Animal1{
	void wakeup() {
		System.out.println("wakeup early ");
	}
	void eat() {
		System.out.println("plane flys");
	}
	void sleep() {
		System.out.println("plane landed");
	}
}

class Dog extends Animal1{
	@Override
	void eat() {
		System.out.println("Dog eats pedigree");
	}
	void dogNature() {
		System.out.println("Dog is friendly animal");
	}
}

class Lion extends Animal1{
	@Override
	void eat() {
		System.out.println("]Lion eats only meast");
	}
	void lionNature() {
		System.out.println("PassengerPlane carry Humans");
	}
}

class Cow extends Animal1{
	@Override
	void eat() {
		System.out.println("Cow eats vegs");
	}
	void cowNature() {
		System.out.println("FighterPlane carry weapons");
	}
}
public class Inher_Override2 {
	public static void main(String[] args) {
		Cow cp= new Cow();
		Lion pp= new Lion();
		Dog fp=new Dog();
		
		cp.wakeup();
		cp.eat();
		cp.sleep();
		cp.cowNature();
		System.out.println("-------------------------------");
		pp.wakeup();
		pp.eat();
		pp.sleep();
		pp.lionNature();
		System.out.println("-------------------------------");
		fp.wakeup();
		fp.eat();
		fp.sleep();
		fp.dogNature();
		System.out.println("-------------------------------");
	}

}
