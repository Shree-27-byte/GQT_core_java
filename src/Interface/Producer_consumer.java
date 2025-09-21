package Interface;
class Producer extends Thread{
	Queue a;
	public Producer(Queue q) {
		a=q;
	}
	@Override
	public void run() {
		int i=1;
		while(true) {		//infinite loop
			a.producer(i++);
		}
	}
}
class Consumer extends Thread{
	Queue b;
	public Consumer(Queue q) {
		b=q;
	}
	@Override
	public void run() {
		while(true) {
			b.consume();
		}
	}
}
class Queue{
	int x;
	public void producer(int i) {
		x=i;
		System.out.println("Producer has produced the data "+x);
	}

	public void consume() {
		System.out.println("Consumer has consume the data "+x);
	}
}
public class Producer_consumer {
	public static void main(String[] args) {
		Queue q = new Queue();
		(new Producer(q)).start();	// producer p=new producer(); p.start();
		(new Consumer(q)).start();
	}
}
