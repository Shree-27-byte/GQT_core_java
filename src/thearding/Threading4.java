package thearding;
class human1 extends Thread{
	@Override
public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+" has entered the restroom");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" is using the restroom");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" has exited the restroom");
			Thread.sleep(3000);
		}
	catch (Exception e) {
		e.printStackTrace();
	}
}
}
public class Threading4 {
		public static void main(String[] args) throws InterruptedException {
			human1 h1 = new human1();
			h1.setName("Men");
			human1 h2 = new human1();
			h2.setName("Women");
			human1 h3 = new human1();
			h3.setName("Others");
		
			// join method without time limits
//			h1.start();
//			h1.join();
//			h2.start();
//			h2.join();
//			h3.start();
			
			// join method with time limits
			h1.start();
			h1.join(5000);   // after 5 seconds next line will start
     		h2.start();
			h2.join(4000);
			h3.start();
		}
}
