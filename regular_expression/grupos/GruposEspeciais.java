import java.util.regex.Pattern;

public class GruposEspeciais {
  public static void main(String[] args) {
    var input = "Qualquer texto pode, se não, dar certo!";

    // positive lookahead
    // var regex = "[\\wÀ-ú]+(?=,)";

    // negative lookahead
    var regex = "[\\wÀ-ú]+(?!,)";

    var matcher = Pattern.compile(regex).matcher(input);

    while (matcher.find()) {
      System.out.println(matcher.group());
    }
  }
}
