import java.util.HashMap;

public class MainHashMap {
  public static void main(String[] args) {
    var persons = new HashMap<Integer, String>();

    persons.put(1, "Luiz");
    persons.put(2, "Deiziane");

    for (var person : persons.entrySet()) {
      System.out.println("ID: " + person.getKey() + "; NAME: " + person.getValue());
    }

    persons.forEach((id, name) -> System.out.println("ID: " + id + "; NAME: " + name));
  }
}
