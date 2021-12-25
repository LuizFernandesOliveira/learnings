import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProblemaPonto {
  public static void main(String[] args) {
    // o ponto nao engloba o \n
    var text = "Bom\ndia";

    var regex = ".";

    Pattern pattern = Pattern.compile(regex, Pattern.DOTALL); // com o uso do dotall ele engloba;

		Matcher matcher = pattern.matcher(text);

		while(matcher.find()) {
			System.out.println(matcher.group());
		}
  }
}
