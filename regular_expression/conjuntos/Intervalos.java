import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Intervalos {
  public static void main(String[] args) {
    var text = "1,2,3,4,5,6,a.b c!d?e[f";

    var regex = "[a-z1-8]";

    Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(text);

		while(matcher.find()) {
			System.out.println(matcher.group());
		}
  }
}
