import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ou {
  public static void main(String[] args) {
    var text = "Você precisa responder sim, não ou não sei!";

    var regex = "sim|não|sei";

    Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(text);

		while(matcher.find()) {
			System.out.println(matcher.group());
		}
  }
}
