import java.util.Scanner;

public class WhileAndDoWhile {
  public static void main(String[] args) {

    Integer age = 1;
    String name;
    
    var input = new Scanner(System.in);

    while (age > 0) {
      System.out.println("Digite seu nome:");
      name = input.nextLine();

      System.out.println("Digite sua idade:");
      age = Integer.parseInt(input.nextLine());

      System.out.println(name + " tem " + age + " anos.");
    }

    do {
      System.out.println("Digite seu nome:");
      name = input.nextLine();

      System.out.println("Digite sua idade:");
      age = Integer.parseInt(input.nextLine());

      System.out.println(name + " tem " + age + " anos.");
    } while (age > 1);

    input.close();
  }
}