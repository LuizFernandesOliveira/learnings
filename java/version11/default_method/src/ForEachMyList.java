import java.util.function.Consumer;

public class ForEachMyList implements Consumer<String> {
  @Override
  public void accept(String s) {
    System.out.println(s);
  }
}
