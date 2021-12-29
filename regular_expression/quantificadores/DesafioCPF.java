import java.util.regex.Pattern;

public class DesafioCPF {
  public static void main(String[] args) {
    // CPF dos aprovados
    var input = "CPF dos aprovados: 600.567.890-12;765.234.654-23";

    var regex = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";

    var matcher = Pattern.compile(regex).matcher(input);

    while(matcher.find()) {
      System.out.println(matcher.group());
    }
  }
}
