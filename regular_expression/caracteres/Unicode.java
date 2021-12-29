// no inicio ...
// um byte (8bits) 256 caraccteres
// simbolos, Pontuação, A-Z, a-z, 0-9

// Dois bytes (16bits) - 65500+ caracters
// +Símbolos, +Pontuação, A-Z, a-z, 0-9

// Unicode
// Quantidade de Bytes Variável - Expansível
// Suporta mais de 1 milhão de caracters
// Atualmente tem mais de 100.000 caracteres atribuídos

// https://unicode-table.com/pt/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Unicode {
  public static void main(String[] args) {
    var text = "aʬc௵d";

    var regex = "\\u02AC|\\u0BF5";

    Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(text);

		while(matcher.find()) {
			System.out.println(matcher.group());
		}
  }
}
