package constructor;
class Plane2{
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

class CargoPlane2 extends Plane2{
	@Override
	void fly() {
		System.out.println("CargoPlane flys at low height");
	}
	void carryGoods() {
		System.out.println("CargoPlane carry Goods");
	}
}

class PassengerPlane2 extends Plane2{
	@Override
	void fly() {
		System.out.println("PassengerPlane flys at medium height");
	}
	void carryHumans() {
		System.out.println("PassengerPlane carry Humans");
	}
}

class FighterPlane2 extends Plane2{
	@Override
	void fly() {
		System.out.println("FighterPlane flys at high height");
	}
	void carryWeapons() {
		System.out.println("FighterPlane carry weapons");
	}
}

class Airport {
	void permit(Plane2 ref) {
		ref.takeoff();
		ref.fly();
		ref.land();
	}
	
}
public class Inher_OverloadingReducing {
	public static void main(String[] args) {
		CargoPlane2 cp1= new CargoPlane2();
		PassengerPlane2 pp1= new PassengerPlane2();
		FighterPlane2 fp1=new FighterPlane2();
		Airport ap=new Airport();
		
		ap.permit(cp1);
		cp1.carryGoods();
		System.out.println("-------------------------------");
		
		ap.permit(pp1);
		pp1.carryHumans();
		System.out.println("-------------------------------");
		
		ap.permit(fp1);
		fp1.carryWeapons();
		System.out.println("-------------------------------");
	}

}
