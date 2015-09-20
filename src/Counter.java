
public class Counter {
  private int count = 0;
  
  public synchronized void printCount() {
    count = count + 1;
    System.out.println("3The count is " + count);
  }
}
