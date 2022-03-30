public class TryCatch {
  public static void main(String[] args) {

    try {
      System.out.println("Iniciou");
      var numbers[] = int[5];

      // forçando erro
      for (int i = 0; i <= numbers.length; i++) {
        numbers[i] = i * i;
      }

      // bloco a ser executado
    } catch (ArrayIndexOutOfBoundsException e) {
      // executa quando existe a execeção no bloco
      System.out.println("Ocorreu um erro");
    } finally {
      // sempre executa
      System.out.println("Finalizou!");
    }
  }
}