public class GenerateReport implements Runnable {
  public static int NUMBER = 1;
  public synchronized void execute() {
    while (NUMBER < 100) {
      System.out.println(NUMBER + " - Generating report await...");
      NUMBER++;
    }
  }

  @Override
  public void run() {
    execute();
  }
}
