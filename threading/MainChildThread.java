package threading;
//"Write a program to create two threads. Print “In main thread” in main thread and “In child 
//thread” in child thread"
class Demo extends Thread{
	public void run() {
		System.out.println("In child Thread");
	}
}
public class MainChildThread {

	public static void main(String[] args) {
		Demo d1=new Demo();
		d1.start();
		System.out.println("In main thread");

	}

}
