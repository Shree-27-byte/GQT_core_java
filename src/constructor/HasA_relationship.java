package constructor;
//Composition
class OS{
	String version_name;
	double version_number;
	public OS(String version_name, double version_number) {
		super();
		this.version_name = version_name;
		this.version_number = version_number;
	}
	public String getVersion_name() {
		return version_name;
	}
	public double getVersion_number() {
		return version_number;
	}
}

//Aggregation
class Charger{
	String Company;
	double Voltage;
	public Charger(String company, double voltage) {
		super();
		this.Company = company;
		this.Voltage = voltage;
	}
	public String getCompany() {
		return Company;
	}
	public double getVoltage() {
		return Voltage;
	}
}

class Mobile{
	OS os=new OS("Windows",15.98);
	void hasCharger(Charger c) {
		System.out.println(c.getCompany());
		System.out.println(c.getVoltage());
	}
}
public class HasA_relationship {

	public static void main(String[] args) {
		Charger c=new Charger("HP",5.5);
		Mobile m = new Mobile();
		System.out.println(m.os.getVersion_name());
		System.out.println(m.os.getVersion_number());
		m.hasCharger(c);
		System.out.println("---------------------------");
		
		m=null;
		System.out.println(c.getCompany());
		System.out.println(c.getVoltage());
		System.out.println("---------------------------");
		
	}

}
