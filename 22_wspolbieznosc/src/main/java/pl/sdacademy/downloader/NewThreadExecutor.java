package pl.sdacademy.downloader;

public class NewThreadExecutor implements Executor {
  @Override
  public void execute(Runnable codeToExecute, TaskFinishedListener listener) {
    Thread thread = new Thread(() -> {
      codeToExecute.run(); //tworzymy runnable który uruchamia innego runnabla, a ten runnable informuje nas kiedy skończył
      listener.taskFinished(); //tutaj powiadamiamy
    });

    thread.start();
  }
}
