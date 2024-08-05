package threading;



class company {
	int n;
	boolean f=false;
	synchronized public void produce_item(int n) {
		if(f) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		this.n = n;
		System.out.println("Produce : " + this.n);
		f=true;
		notify();
	}
	synchronized public void consume_item() {
		if(!f) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("consume : " + this.n);
		f=false;
		notify();
	}
}
class Producer extends Thread {
	company c;

	public Producer(company c) {
		this.c = c;
	}

	public void run() {
		int i = 1;
		while (true) {
			c.produce_item(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			i++;
		}
	}
}

class Consumer extends Thread {
	company c;

	public Consumer(company c) {
		this.c = c;
	}

	public void run() {
		int i = 1;

		while (true) {
				c.consume_item();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			i++;
		}
	}
}
public class CustomerProducer {

	public static void main(String[] args) {
		company com = new company();
		Producer p = new Producer(com);
		Consumer c1 = new Consumer(com);
		p.start();
		c1.start();

	}

}
