import java.util.regex.Pattern;

public class DesafioTelefone {
  public static void main(String[] args) {
    var input = "Lista telefonica: (84) 98753-1212; (54) 98765-3542 98765-2342";

    var regex = "\\(?\\d{0,2}\\)?\\s?\\d{4,5}\\-\\d{4}";

    var matcher = Pattern.compile(regex).matcher(input);

    while(matcher.find()) {
      System.out.println(matcher.group());
    }
  }
}
