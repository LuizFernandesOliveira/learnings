import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IntervalosCuidados {
  public static void main(String[] args) {
    var text = "ABC [abc] a-c 1234";

    var regex = "[A-z]"; // intevalos usam a ordem da tabela UNICODE
    // var regex = [z-A] //intervalo inválido

    Pattern pattern = Pattern.compile(regex);

    Matcher matcher = pattern.matcher(text);

    while(matcher.find()) {
      System.out.println(matcher.group());
    }
  }
}
