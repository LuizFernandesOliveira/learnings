import java.util.regex.Pattern;

public class MetaCaracteres {
  public static void main(String[] args) {
    /**
     *  . -> caractere qualquer
     *  [] -> conjunto de caracteres permitidos
     *  [^] -> conjunto de caracteres proibidos
     *  ? -> opcional
     *  * -> zero ou mais
     *  + ->  um ou mais
     *  {n,m} -> de n até m
     *  ^ -> início de linha
     *  $ -> fim de linha
     *  \b -> início ou fim de palavra
     *  \ -> uso de metacaracters
     *  | -> operação ou
     *  ( ) -> define grupo
     *  \1...\9 -> resgata grupos já definidos
     */

    var text = "1,2,3,4,5,6,a.b c!d?e";

    var regex = ",|\\.|\\?|!| ";

    var splited = text.split(regex);

    for (String string : splited) {
      System.out.println(string);
    }
  } 
}
