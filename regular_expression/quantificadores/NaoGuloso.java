import java.util.regex.Pattern;

public class NaoGuloso {
  public static void main(String[] args) {
    var text = "<div>Conteudo 01</div><div>Conteudo 02</div>";

    // São gulosos
    var regex = "<div>.+</div>";
    // var regex = "<div>.*</div>";
    // var regex = "<div>.{1,100}</div>";

    // Nao são gulosos
    // var regex = "<div>.+?</div>";
    // var regex = "<div>.*?</div>";
    // var regex = "<div>.{1,100}?</div>";

    var matcher = Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher(text);

    while (matcher.find()) {
      System.out.println(matcher.group());
    }
  }
}
