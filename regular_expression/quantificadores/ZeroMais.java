import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZeroMais {
  public static void main(String[] args) {
    var text = "De longe eu avistei o fogo e uma pessoa gritando: FOGOOOO!";

    var text2 = "There is a big fog in NYC";

    var regex1 = "fogo*";

    var regex2 = "fogo*";

    Pattern pattern1 = Pattern.compile(regex1, Pattern.CASE_INSENSITIVE);
    Pattern pattern2 = Pattern.compile(regex2);

    Matcher matcher1 = pattern1.matcher(text);
    Matcher matcher2 = pattern1.matcher(text2);

    while(matcher1.find()) {
      System.out.println(matcher1.group());
    }

    while(matcher2.find()) {
      System.out.println(matcher2.group());
    }
  }
}
