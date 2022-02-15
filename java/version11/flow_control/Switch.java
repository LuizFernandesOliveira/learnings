public class Switch {
  public static void main(String[] args) {
    int value = 10;

    switch (value) {
      case 1:
        System.out.println("número 1");
        break;
      case 5:
        System.out.println("número 5");
        break;
      case 10:
        System.out.println("número 10");
        break;
      default:
        System.out.println("número inválido");
    }
  }
}