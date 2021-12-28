import java.util.regex.Pattern;

// retrovisores armazenam o match do grupo
// podem ser usado usando \1, \2, etc

public class Retrovisor {
  public static void main(String[] args) {
    var input = "<b>Destaque</b><strong>forte</strong><div>Conteúdo</div>";

    var regex = "<(\\w+)>.*</\\1>";
    // ?: antecedendo o grupo não guarda o valor

    var matcher = Pattern.compile(regex).matcher(input);

    while (matcher.find()) {
      System.out.println(matcher.group());
    }
  }
}
