package pl.sdacademy.event;

public class EventExample {
  public static void main(String[] args) {
    runInThread(()-> {
      System.out.println("Calculating the result...");
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      //TODO: finished
            });
  }

  private static void runInThread(Runnable runnable){
    Thread thread = new Thread(runnable);
    thread.start();
    //TODO: how to notify other client?
  }

  private static interface Callback{
    void processingFinished();
  }

}
