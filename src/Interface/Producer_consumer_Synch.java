package Interface;
class Producer1 extends Thread{
	Queue1 a;
	public Producer1(Queue1 q) {
		a=q;
	}
	@Override
	public void run() {
		int i=1;
		while(true) {		//infinite loop
			a.producer1(i++);
		}
	}
}
class Consumer1 extends Thread{
	Queue1 b;
	public Consumer1(Queue1 q) {
		b=q;
	}
	@Override
	public void run() {
		while(true) {
			b.consume1();
		}
	}
}
class Queue1{
	int x;
	boolean value_x=false;
	synchronized public void producer1(int i) {
		try{
			if(value_x==false) {
			x=i;
			System.out.println("Producer has produced the data "+x);
			value_x=true;
			notify();
	}
			else {
				wait();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	synchronized public void consume1() {
		try{
			if(value_x==true) {
			System.out.println("Consumer has consumed the data "+x);
			value_x=false;
			notify();
	}
			else {
				wait();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class Producer_consumer_Synch {
	public static void main(String[] args) {
		Queue1 q = new Queue1();
		(new Producer1(q)).start();	// producer p=new producer(); p.start();
		(new Consumer1(q)).start();
	}
}
