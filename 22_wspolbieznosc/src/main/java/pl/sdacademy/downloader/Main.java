package pl.sdacademy.downloader;

public class Main {
  public static void main(String[] args) {
    /**CommandLineRunner commandLine = new CommandLineRunner(
            url -> System.out.printf("Download file %s ", url)
    );
    commandLine.run(System.in);**/

    CommandLineRunner commandLine = new CommandLineRunner(new FileDownloader());
    commandLine.run(System.in);
  }
}
