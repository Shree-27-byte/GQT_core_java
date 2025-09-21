package thearding;
class human extends Thread{
	@Override
public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+"has entered the restroom");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+"is using the restroom");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+"has exited the restroom");
			Thread.sleep(3000);
		}
	catch (Exception e) {
		e.printStackTrace();
	}
}
}
public class Threading3 {
		public static void main(String[] args) {
			human h1 = new human();
			h1.setName("Men");
			human h2 = new human();
			h2.setName("Women");
			human h3 = new human();
			h3.setName("Others");
			h1.start();
			h2.start();
			h3.start();
		}
}
