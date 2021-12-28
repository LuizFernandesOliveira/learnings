import java.util.regex.Pattern;

public class GruposAninhados {
  public static void main(String[] args) {
    var input = "supermercado hipermercado minimercado mercado";

    // var regex = "(super|hiper|mini)mercado";
    var regex = "((su|hi)per|mini)mercado";

    var matcher = Pattern.compile(regex).matcher(input);

    while (matcher.find()) {
      System.out.println(matcher.group());
    }
  }
}
