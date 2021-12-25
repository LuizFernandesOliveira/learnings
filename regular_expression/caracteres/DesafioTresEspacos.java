import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DesafioTresEspacos {
  public static void main(String[] args) {
    var text = "a   b";

    var regex = "a\\s+b";

    Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(text);

		while(matcher.find()) {
			System.out.println(matcher.group());
		}
  }
}
