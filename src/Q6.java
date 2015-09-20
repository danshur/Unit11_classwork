public class Q6 implements Runnable {
  
  private Counter counter;
  
  public Q6(Counter counter) {
    this.counter = counter;
  }
  @Override
  public void run() {
    int count = 0;
    while (count++ < 100) {
      counter.printCount();
      
    }
  }
  
  public static void main(String[] args) {
    Counter counter = new Counter();
    Thread t1 = new Thread(new Q6(counter));
    Thread t2 = new Thread(new Q6(counter));
    t1.start();
    t2.start();
  }
}
/*public class Counter {
  private int count = 0;
  
  public synchronized void printCount() {
    count = count + 1;
    System.out.println("1The count is " + count);
  }
}*/
