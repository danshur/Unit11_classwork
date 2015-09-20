import java.util.ArrayList;
import java.util.List;

public class Q8 {
  
  public static List<String> entries = new ArrayList<String>();
  
  public synchronized static void addEntry(String entry) {
    entries.add(entry);
  }
  
  public synchronized List<String> popEntries() throws InterruptedException {
    if (entries.isEmpty()) {
      wait();
    }
    List<String> copyOfEntries = new ArrayList<String>();
    copyOfEntries.addAll(entries);
    entries.clear();
    return copyOfEntries;
  }
  
  public static void main(String[] args){
	  addEntry("1");
  }
  
}
