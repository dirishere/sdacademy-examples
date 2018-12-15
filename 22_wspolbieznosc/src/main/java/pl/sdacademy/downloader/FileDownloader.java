package pl.sdacademy.downloader;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class FileDownloader implements UrlDownloader {
  @Override
  public void download(String url) {
    try {
      URL urlObject = new URL(url);
      InputStream input = urlObject.openConnection().getInputStream();
      Path file = Paths.get("C:\\Users\\Lol\\Downloads", filename(url));
      Files.copy(input, file);
      System.out.println(String.format("Saved url %s to file %s ", url, file));

    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  private String filename(String url) {
    return String.format("file-%s", new Random().nextInt(1000));
  }
}
