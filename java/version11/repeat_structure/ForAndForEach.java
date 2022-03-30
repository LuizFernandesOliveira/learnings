import java.util.Scanner;

public class ForAndForEach {
  public static void main(String[] args) {
    Integer age = 1;
    String name;

    var input = new Scanner(System.in);

    // for
    for (var i = 0; i < 5; i += 1) {
      System.out.println("Digite seu nome:");
      name = input.nextLine();

      System.out.println("Digite sua idade:");
      age = Integer.parseInt(input.nextLine());

      System.out.println(name + " tem " + age + " anos.");
    }

    // foreach
    for (var character : name.toCharArray()) {
      System.out.println(character);
    }

    input.close();
  }
}