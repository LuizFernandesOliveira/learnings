public class GenerateReport implements Runnable {
  public static int NUMBER = 1;
  public static String CURR = "REPORT";
  public synchronized void execute() {
    while (NUMBER < 100 && GenerateReport.CURR.equals("REPORT")) {
      System.out.println(NUMBER + " - Generating report await...");
      NUMBER++;
      CURR = "PROGRESS";
    }

    CURR = "REPORT";
  }

  @Override
  public void run() {
    execute();
  }
}
