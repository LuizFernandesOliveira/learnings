import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Conjuntos {
  public static void main(String[] args) {
    var text = "1,2,3,4,5,6,a.b c!d?e[f";

    // para definir uma classe (ou conjunto) de caracteres usa []

    var regex = "[02468]";

    Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(text);

		while(matcher.find()) {
			System.out.println(matcher.group());
		}
  }
}
