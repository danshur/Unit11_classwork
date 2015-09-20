
public class SimpleThread implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleThread r = new SimpleThread();
		Thread t = new Thread(r);
		t.start();
		System.out.println("I am the parent thread");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("I am a thread in run method.");
	}

}
