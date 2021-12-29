import java.util.regex.Pattern;

public class CaracteresSimples {
  public static void main(String[] args) {
    var text = "1,2,3,4,5,6,a.b c!d?e";

    var regex = ",";

    var result = text.split(regex);

    for (String string : result) {
      System.out.println(string);
    }

    var pattern = Pattern.compile(regex);

    var matcher = pattern.matcher("123,1230");

    while(matcher.find()) {
      System.out.println(matcher.start() + " " + matcher.end() + " " + matcher.group());
    }

    var test = text.matches("a");

    System.out.println(test);
  }
}
