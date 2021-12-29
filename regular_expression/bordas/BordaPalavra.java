public class BordaPalavra {
  public static void main(String[] args) {
    var input = "A intenção é toda";

    var regex = "\\bin\\w+"; // início da palavra
    // var regex = "\\w+ão\\b" // fim de linha

    var matcher = Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher(input);

    while (matcher.find()) {
      System.out.println(matcher.group());
    }
  }
}
