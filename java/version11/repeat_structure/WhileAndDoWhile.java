import java.util.Scanner;

public class WhileAndDoWhile {
  public static void main(String[] args) {

    Integer age;
    String name;
    
    var input = new Scanner(System.in);
    
    System.out.println("Digite seu nome:");

    age = input.nextInt();

    input.close();
  }
}