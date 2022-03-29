public class ProgressBar implements Runnable {

  public synchronized void execute() {
    while (GenerateReport.NUMBER < 100 && GenerateReport.CURR.equals("PROGRESS")) {
      System.out.println(GenerateReport.NUMBER + " - In progress await...");
      GenerateReport.NUMBER++;
      GenerateReport.CURR = "REPORT";
    }

    GenerateReport.CURR = "PROGRESS";
  }

  @Override
  public void run() {
    execute();
  }
}
