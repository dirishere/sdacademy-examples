package pl.sdacademy.downloader;

import java.io.InputStream;
import java.util.Scanner;

public class CommandLineRunner {

  private UrlDownloader downloader;
  private Executor executor;

  public CommandLineRunner(UrlDownloader downloader, Executor executor){
    this.downloader = downloader;
    this.executor = executor;
  }

  void run(InputStream inputStream) {
    Scanner scanner = new Scanner(inputStream);
    scanner.useDelimiter("\n");
    while (scanner.hasNext()) {
      String command = scanner.next();
      //TODO if command == get url -> download file; else if command equals exit -> exit; else bad command
      if ("exit".equals(command)) {
        return;
      } else if (!command.isEmpty()) {
        downloadURL(command);
      }
    }
  }

  private void downloadURL(String command) {
    //Thread thread = new Thread(() -> downloader.download(command));
    //thread.start();
    executor.execute(() -> downloader.download(command), () -> {
      System.out.println("File downloaded.");
    });
  }
}
