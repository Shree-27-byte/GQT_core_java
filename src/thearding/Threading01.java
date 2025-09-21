package thearding;
class Microword extends Thread{
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("typing")) {
			typing();
		}
		else if(Thread.currentThread().getName().equals("checking")) {
			checking();
		}
		else {
			saving();
		}
	}

	private void typing() {
		try {
			for(int i=1; i<=5; i++) {
					System.out.println("Typing in progress....");
					Thread.sleep(2000);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void checking() {
		try {
			for(int i=1; i<=5; i++) {
					System.out.println("Checking in progress....");
					Thread.sleep(2000);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void saving() {
		try {
			for(int i=1; i<=5; i++) {
					System.out.println("Saving in progress....");
					Thread.sleep(2000);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class Threading01 {
	public static void main(String[] args) {
			Microword m1= new Microword();
			Microword m2= new Microword();
			Microword m3= new Microword();
			System.out.println("-----------------");
			m1.start();
			m2.start();
			m3.start();
			}
}
