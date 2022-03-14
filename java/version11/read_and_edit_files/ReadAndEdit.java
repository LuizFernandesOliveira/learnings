import java.util.Scanner;
import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadAndEdit {
  public static void main(String[] args) {
    var input = new Scanner(System.in);

    // escrevendo em arquivos
    try {
      var file = new PrintStrem(new FileOutputStream("saida.txt", true));

      file.println("TEST");

      file.close();
    } catch (FileNotFoundException e) {
      // arquivo não criado
    }

    // lendo em arquivos
    try {
      var file = new Scanner(new FileInputStream("saida.txt"));

      while (file.hasNextLine()) {
        var line = file.nextLine();

        System.out.println(line);
      }

      file.close();
    } catch (FileNotFoundException e) {
      // arquivo não encontrado
    }

    input.close();
  }
}