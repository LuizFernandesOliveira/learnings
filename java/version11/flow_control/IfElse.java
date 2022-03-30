public class IfElse {
  public static void main(String[] args) {
    int number = 8;

    if (number % 2 == 0) System.out.println("É par");
    else System.out.println("É ímpar");

    if (number > 10) {
      System.out.println("Maior que 10!");
    } else {
      System.out.println("Menor que 10!");
    }

    if (number > 10) {
      System.out.println("Maior que 10!");
    } else if (number == 10) {
      System.out.println("igual a 10!");
    } else {
      System.out.println("Menor que 10!");
    }
  }
}