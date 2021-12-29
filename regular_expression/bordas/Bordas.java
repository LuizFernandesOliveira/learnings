import java.util.regex.Pattern;

public class Bordas {
  public static void main(String[] args) {
    var input = "A intenção é toda";

    var regex = "^a"; // início de linha
    // var regex = "a$" // fim de linha

    var matcher = Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher(input);

    while (matcher.find()) {
      System.out.println(matcher.group());
    }
  }
}
