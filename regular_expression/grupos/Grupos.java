import java.util.regex.Pattern;

public class Grupos {
  public static void main(String[] args) {
    var input = "O josé simão é muito engraçado... heheheheh";

    var regex = "(he)";

    var matcher = Pattern.compile(regex).matcher(input);

    while (matcher.find()) {
      System.out.println(matcher.group());
    }
  }
}
