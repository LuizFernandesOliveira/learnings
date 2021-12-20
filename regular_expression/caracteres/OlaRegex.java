import java.lang.Character.UnicodeScript;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OlaRegex {
  public static void main(String[] args) {
    String text = "A Casa que você quer casar foi atribuida depois do CASAMENTO";

    Pattern pattern = Pattern.compile("casa", Pattern.CASE_INSENSITIVE);

    Matcher matcher = pattern.matcher(text);

    while(matcher.find()) {
      System.out.println(matcher.start() + " " + matcher.end() + " " + matcher.group());
    }
  }
}
