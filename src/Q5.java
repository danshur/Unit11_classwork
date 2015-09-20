
public class Q5 implements Runnable {
  @Override
  public void run() {
    int count = 0;
    while (count++ < 3) {
      System.out.println("child");
    }
  }
  
  public static void main(String[] args) {
    Thread t = new Thread(new Q5());
    t.start();
    int count = 0;
    while (count++ < 3) {
      System.out.println("parent");
    }
  }
}

