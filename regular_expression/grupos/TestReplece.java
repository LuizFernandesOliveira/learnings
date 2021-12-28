public class TestReplece {
  public static void main(String[] args) {
    var input = "abcdefghijklmno";

    var repleced = input.replaceAll("(a)(b)(c)(d)(e)(f)", "$1-$2-$3");

    System.out.println(repleced);
  }
}
