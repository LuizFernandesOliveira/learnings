import java.util.regex.Pattern;

public class Ponto {
  public static void main(String[] args) {
    // . é um coringa, válido para uma posição

    var text = "1,2,3,4,5,6,7,8,9,0";

    var regex = "1..|9..";

    var pattern = Pattern.compile(regex, Pattern.DOTALL);

    var matcher = pattern.matcher(text);

    while(matcher.find()) {
      System.out.println(matcher.group());
    }
  }
}
