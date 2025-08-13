package constructor;
abstract class Test{
	void land() {
		System.out.println("Plane lands");
	}
}
abstract class Plane{
	abstract void takeOff();
	abstract void fly();
	void land() {
		System.out.println("Planee lands");
	}
}
class CargoPlane extends Plane{
	@Override
	void takeOff() {
		System.out.println("CargoPlane needs high length runway");
	}
	@Override
	void fly() {
		System.out.println("CargoPlane flys at low height");
	}
	void carryGoods() {
		System.out.println("CargoPlane carry Goods");
	}
}

class PassengerPlane extends Plane{
	@Override
	void takeOff() {
		System.out.println("PassengerPlane needs medium length runway");
	}
	@Override
	void fly() {
		System.out.println("PassengerPlane flys at medium height");
	}
	void carryHumans() {
		System.out.println("PassengerPlane carry Humans");
	}
}

class FighterPlane extends Plane{
	@Override
	void takeOff() {
		System.out.println("FighterPlane needs low length runway");
	}
	@Override
	void fly() {
		System.out.println("FighterPlane flys at high height");
	}
	void carryWeapons() {
		System.out.println("FighterPlane carry weapons");
	}
}
public class Abstract {
	public static void main(String[] args) {
		CargoPlane cp= new CargoPlane();
		PassengerPlane pp= new PassengerPlane();
		FighterPlane fp=new FighterPlane();
		
		cp.takeOff();
		cp.fly();
		cp.land();
		cp.carryGoods();
		System.out.println("-------------------------------");
		pp.takeOff();
		pp.fly();
		pp.land();
		pp.carryHumans();
		System.out.println("-------------------------------");
		fp.takeOff();
		fp.fly();
		fp.land();
		fp.carryWeapons();
		System.out.println("-------------------------------");
		
		Plane p1 =new Plane() {
			@Override
			void takeOff() {
				System.out.println("take off");
			}
			@Override
			void fly() {
				System.out.println("Fly");
			}
		};
		p1.takeOff();
		p1.fly();
		p1.land();

	}

}
