import java.util.HashSet;

public class MainHashSet {
  public static void main(String[] args) {
    var federations = new HashSet<String>();

    federations.add("RN");
    federations.add("PB");

    for (var federation : federations) {
      System.out.println(federation);
    }
  }
}
