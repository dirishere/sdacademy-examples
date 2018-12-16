package pl.sdacademy.thread;

import pl.sdacademy.downloader.Executor;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
  public static void main(String[] args) {
    ExecutorService executorService = Executors.newFixedThreadPool(4);
    Runnable runnable = () -> {
      System.out.printf("Executing command in thread %s\n", Thread.currentThread().getId());
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    };

    //CompletableFuture.supplyAsync(()-> 4, executorService).thenAccept(System.out:: println);

    executorService.submit(runnable);
    executorService.submit(runnable);
    executorService.submit(runnable);
    executorService.submit(runnable);
    executorService.submit(runnable);
  }
}
