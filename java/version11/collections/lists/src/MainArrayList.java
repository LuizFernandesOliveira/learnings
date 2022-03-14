import java.util.ArrayList;

public class MainArrayList {
  public static void main(String[] args) {

    var names = new ArrayList<String>();

    names.add("Luiz");
    names.add("Deizane");

    for (var i = 0; i < names.size(); i++) {
      System.out.println(names.get(i));
    }

    for (var name : names) {
      System.out.println(name);
    }

    names.forEach(System.out::println);
  }
}
