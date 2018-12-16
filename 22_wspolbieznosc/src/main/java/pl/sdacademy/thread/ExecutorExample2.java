package pl.sdacademy.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorExample2 {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ExecutorService executorService = Executors.newFixedThreadPool(4);
    //executorService.submit(()-> System.out.println("Hello"));

    //executorService.shutdown();

    Future<Integer> result1 = executorService.submit(() -> 2);
    Future<Integer> result2 = executorService.submit(() -> 3);
    Future<Integer> result3 = executorService.submit(() -> 4);

    System.out.println(result1.get() + result2.get() + result3.get());

    executorService.shutdown();

    //dla tablicy invokeAll i kolekcja Featurów


  }
}
