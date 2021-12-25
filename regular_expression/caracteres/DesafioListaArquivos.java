import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DesafioListaArquivos {
  public static void main(String[] args) {
    var text = "lista de arquivos mp3: jazz.mp3,rock.mp3,podcast.mp3,blues.mp3";

    var regex = "\\.mp3";

    Pattern pattern = Pattern.compile(regex);

    Matcher matcher = pattern.matcher(text);

    while(matcher.find()) {
      System.out.println(matcher.group());
    }
  }
}
