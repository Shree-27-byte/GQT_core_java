package constructor;
class PlaneOR{
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

class CargoPlaneOR extends PlaneOR{
	@Override
	void fly() {
		System.out.println("CargoPlane flys at low height");
	}
	void carryGoods() {
		System.out.println("CargoPlane carry Goods");
	}
}

class PassengerPlaneOR extends PlaneOR{
	@Override
	void fly() {
		System.out.println("PassengerPlane flys at medium height");
	}
	void carryHumans() {
		System.out.println("PassengerPlane carry Humans");
	}
}

class FighterPlaneOR extends PlaneOR{
	@Override
	void fly() {
		System.out.println("FighterPlane flys at high height");
	}
	void carryWeapons() {
		System.out.println("FighterPlane carry weapons");
	}
}
public class Inher_Override {
	public static void main(String[] args) {
		CargoPlaneOR cp= new CargoPlaneOR();
		PassengerPlaneOR pp= new PassengerPlaneOR();
		FighterPlaneOR fp=new FighterPlaneOR();
		
		cp.takeoff();
		cp.fly();
		cp.land();
		cp.carryGoods();
		System.out.println("-------------------------------");
		pp.takeoff();
		pp.fly();
		pp.land();
		pp.carryHumans();
		System.out.println("-------------------------------");
		fp.takeoff();
		fp.fly();
		fp.land();
		fp.carryWeapons();
		System.out.println("-------------------------------");
	}

}
