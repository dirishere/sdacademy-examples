package pl.sdacademy.io;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IoExample {
  public static void main(String[] args) throws IOException {
    File file; //stare programy w java
    Path path = Paths.get("files", "sourceFile.txt"); //nowsze programy

    try (BufferedReader bufferReader = new BufferedReader(new InputStreamReader((new FileInputStream((path.toFile())))))){
      //jak jest w try source nie trzeba go zamykać
      String line = bufferReader.readLine();
      while (line != null) {
        System.out.println(line);
        line = bufferReader.readLine();
      }
    }
  }

  private static InputStream inMemorySource() { //ten source zamiast "path.toFile()"
    return new ByteArrayInputStream("hello".getBytes());
  }
}
