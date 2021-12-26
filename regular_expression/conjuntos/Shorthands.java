import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Shorthands {
  public static void main(String[] args) {
    // \d ~ [0-9] pega todos os números
    // \D ~ [^0-9] pega todos que não são números
    // \w ~ [A-Za-z0-9_] pega todos os caracters
    // \s ~ [ \t\n\r\f]

    var text = "1,2,3,4,5,6,a.b,c d!f";

    var regex = "\\d";
    // var regex = "\\D";
    // var regex = "\\w";

    Pattern pattern = Pattern.compile(regex);

    Matcher matcher = pattern.matcher(text);

    while(matcher.find()) {
      System.out.println(matcher.group());
    }
  }
}
