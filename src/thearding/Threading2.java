package thearding;
class Microwords extends Thread{
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
			for(;;) {
					System.out.println("Checking in progress....");
					Thread.sleep(2000);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void saving() {
		try {
			for(int i=0; i<=5; i++) {
					System.out.println("Saving in progress....");
					Thread.sleep(2000);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class Threading2 {
	public static void main(String[] args) {
			Microwords m1= new Microwords();
			m1.setName("typing");
			Microwords m2= new Microwords();
			m2.setName("checking");
			m2.setPriority(8);
			m2.setDaemon(true);
			
			Microwords m3= new Microwords();
			m3.setName("saving");
			m3.setPriority(9);
			m3.setDaemon(true);
			
			System.out.println("m1");
			System.out.println("m2");
			System.out.println("m3");
			System.out.println("-----------------");
			m1.start();
			m2.start();
			m3.start();
			}
}
