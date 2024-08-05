package threading;
//"Create two threads and call them EvenThread and OddThread. EvenThread will print number 
//as 2 4 6 8 10... and OddThread will print number as 1 3 5…. Now synchronize these two thread to get the output as 1 2 3 4 5 6 7 8"

class Test{
	int n;
	boolean f=false;
	synchronized void printEven(int n) {
		if(f) {
		try {
			wait();//wait() instructs the calling thread to shut down the monitor and sleep until another thread enters the monitor and calls notify().
		} catch (InterruptedException e) {
			
			e.printStackTrace();//The printStackTrace() method in Java is a tool used to handle exceptions and errors.
		}
		}
		this.n=n;
		System.out.println("Even number: "+this.n);//0
		f=true;
		notify();//notify() wakes up the first thread that is called wait() on the same object.
		
	}
	synchronized void printOdd(int n) {
		if(!f) {
		try {
			wait();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}
		this.n=n;
		System.out.println("Odd Number: "+this.n);
		f=false;
		notify();
		
	}
}

class EvenThread extends Thread{
	Test t;
	public EvenThread(Test t) {
		this.t=t;
	}
	public void run() {
		
		for(int i=0;i<=8;i+=2) {
			t.printEven(i);
		}
		
	}
	
}
class OddThread extends Thread{
	Test t;
	public OddThread(Test t) {
		this.t=t;
	}
	public void run() {
		
		for(int i=1;i<=8;i+=2) {
			t.printOdd(i);
		}
		
	}
	
}
public class EvenOddThread {

	public static void main(String[] args) {
		Test t1=new Test();
		EvenThread et=new EvenThread(t1);
		OddThread ot=new OddThread(t1);
		et.start();
		ot.start();

	}

}
