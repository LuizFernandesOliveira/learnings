import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Brancos {
	public static void main(String[] args) {
		var text = "" + 
		"ca	r\n" +
		"r	o s!";

		var regex = "ca\\tr\\nr\\to\\ss!";

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(text);

		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
