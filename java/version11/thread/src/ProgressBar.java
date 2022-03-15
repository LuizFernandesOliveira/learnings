public class ProgressBar implements Runnable {

  public synchronized void execute() {
    while (GenerateReport.NUMBER < 100) {
      System.out.println(GenerateReport.NUMBER + " - In progress await...");
      GenerateReport.NUMBER++;
    }
  }

  @Override
  public void run() {
    execute();
  }
}
