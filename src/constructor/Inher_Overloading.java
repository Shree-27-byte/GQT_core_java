package constructor;
class Plane1{
	void takeoff() {
		System.out.println("plane took off ");
	}
	void fly() {
		System.out.println("plane flys");
	}
	void land() {
		System.out.println("plane landed");
	}
}

class CargoPlane1 extends Plane1{
	@Override
	void fly() {
		System.out.println("CargoPlane flys at low height");
	}
	void carryGoods() {
		System.out.println("CargoPlane carry Goods");
	}
}

class PassengerPlane1 extends Plane1{
	@Override
	void fly() {
		System.out.println("PassengerPlane flys at medium height");
	}
	void carryHumans() {
		System.out.println("PassengerPlane carry Humans");
	}
}

class FighterPlane1 extends Plane1{
	@Override
	void fly() {
		System.out.println("FighterPlane flys at high height");
	}
	void carryWeapons() {
		System.out.println("FighterPlane carry weapons");
	}
}
public class Inher_Overloading {
	public static void main(String[] args) {
		CargoPlane1 cp1= new CargoPlane1();
		PassengerPlane1 pp1= new PassengerPlane1();
		FighterPlane1 fp1=new FighterPlane1();
		Plane1 ref;
		
		ref=cp1;
		ref.takeoff();
		ref.fly();
		ref.land();
		cp1.carryGoods();
		System.out.println("-------------------------------");
		
		ref=pp1;
		ref.takeoff();
		ref.fly();
		ref.land();
		pp1.carryHumans();
		System.out.println("-------------------------------");
		
		ref=fp1;
		ref.takeoff();
		ref.fly();
		ref.land();
		fp1.carryWeapons();
		System.out.println("-------------------------------");
	}

}
