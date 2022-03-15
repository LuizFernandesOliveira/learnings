public class Main {
  public static void main(String[] args) throws InterruptedException {
    var progress = new ProgressBar();
    var t1 = new Thread(progress);
    t1.start();
    t1.join();
    var report = new GenerateReport();
    var t2 = new Thread(report);
    t2.start();
    t2.join();

    System.out.println("STATUS t1: " + t1.getState());
    System.out.println("STATUS t2: " + t2.getState());
  }
}