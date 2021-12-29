import java.util.regex.Pattern;

public class UsandoChaves {
  public static void main(String[] args) {
    var text = "O joão recebeu 120 milhoes apostando 6 9 21 24 45 46";

    // para definir um quantificador usa {}
    var regex = "\\d{1,2}";
    // var regex = "\\d{2}";
    // var regex = "\\d{1,}";
    // var regex = "\\w{7}";
    // var regex = "\\wõ{7,}";

    var matcher = Pattern.compile(regex).matcher(text);

    while(matcher.find()) {
      System.out.println(matcher.group());
    }
  }
}
