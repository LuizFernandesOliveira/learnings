import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    // comparators
    var list = new ArrayList<String>();
    list.add("Luiz");
    list.add("Rebeca");

    var comparator = new ComparatorByLength();
    list.sort(comparator);

    // forEach
    var consumer = new ForEachMyList();
    list.forEach(consumer);
  }
}
