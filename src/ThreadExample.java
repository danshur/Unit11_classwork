
public class ThreadExample implements Runnable {

	@Override
	public void run() {
		for (int i=0; i< 100; i++){
			System.out.println("I am a child thread, my counter is " + i);
		}
		
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		long stopTime = System.currentTimeMillis();
		long sleepTime = stopTime - startTime; 
		Runnable r = new ThreadExample();
		Thread t = new Thread(r);
		t.start();
		//System.out.println("I am the parent thread, slept for " + sleepTime);
		for (int i=0; i< 100; i++){
			System.out.println("I am a parent thread, my counter is " + i);
		}
	}

}
