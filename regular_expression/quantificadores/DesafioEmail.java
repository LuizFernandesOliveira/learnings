import java.util.regex.Pattern;

public class DesafioEmail {
  public static void main(String[] args) {
    var input = "lista de emails: email@gmail.com; email3@hotmail.com.br";

    var regex = "[\\w.]+@\\w+\\.\\w{2,4}\\.?\\w{0,2}";

    var matcher = Pattern.compile(regex).matcher(input);

    while(matcher.find()) {
      System.out.println(matcher.group());
    }
  }
}
