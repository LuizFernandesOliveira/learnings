import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlgunsCuidados {
  public static void main(String[] args) {
    String textOfLine = "...";
    String textOfMultiplyLine = "..." +
      "...";

    // cuidado com o tab
    System.out.println(Pattern.matches("\\s", " "));
  }
}
